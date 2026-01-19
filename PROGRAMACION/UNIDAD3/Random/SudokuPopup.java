package UNIDAD3.Random;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class SudokuPopup extends JFrame {

    private JTextField[][] celdas = new JTextField[9][9];

    public SudokuPopup() {
        setTitle("Sudoku Solver - Versión Corregida");
        setSize(550, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(15, 15));

        JPanel panelSudoku = new JPanel(new GridLayout(9, 9));
        panelSudoku.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                celdas[i][j] = crearCampoSudoku(i, j);
                panelSudoku.add(celdas[i][j]);
            }
        }

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        
        JButton btnResolver = new JButton("Resolver Sudoku");
        btnResolver.setPreferredSize(new Dimension(160, 40));
        btnResolver.setBackground(new Color(46, 204, 113));
        btnResolver.addActionListener(e -> resolverYMostrar());

        JButton btnLimpiar = new JButton("Limpiar Tablero");
        btnLimpiar.setPreferredSize(new Dimension(160, 40));
        btnLimpiar.setBackground(new Color(231, 76, 60));
        
        // --- ACCIÓN DE LIMPIAR MEJORADA ---
        btnLimpiar.addActionListener(e -> {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    celdas[i][j].setText(""); // Borra el contenido
                    celdas[i][j].setForeground(Color.BLACK); // Resetea color a negro
                }
            }
            celdas[0][0].requestFocus(); // Pone el cursor en la primera casilla
        });

        panelBotones.add(btnResolver);
        panelBotones.add(btnLimpiar);

        add(new JLabel("Introduce los números (0-9) y pulsa Resolver", SwingConstants.CENTER), BorderLayout.NORTH);
        add(panelSudoku, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private JTextField crearCampoSudoku(int fila, int col) {
        JTextField campo = new JTextField();
        campo.setHorizontalAlignment(JTextField.CENTER);
        campo.setFont(new Font("SansSerif", Font.BOLD, 22));

        // Bordes 3x3
        int top = (fila % 3 == 0) ? 3 : 1;
        int left = (col % 3 == 0) ? 3 : 1;
        int bottom = (fila == 8) ? 3 : 1;
        int right = (col == 8) ? 3 : 1;
        campo.setBorder(BorderFactory.createMatteBorder(top, left, bottom, right, Color.BLACK));

        // Filtro corregido para permitir borrar (length == 0)
        ((AbstractDocument) campo.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) 
                    throws BadLocationException {
                // Permitir borrar (cuando text está vacío) o escribir un solo número
                if (text.isEmpty() || (text.matches("[0-9]") && (fb.getDocument().getLength() + text.length() - length) <= 1)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        return campo;
    }

    private void resolverYMostrar() {
        int[][] tablero = new int[9][9];
        // Guardamos qué celdas estaban vacías originalmente para pintarlas luego
        boolean[][] eraVacio = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String val = celdas[i][j].getText();
                if (val.isEmpty() || val.equals("0")) {
                    tablero[i][j] = 0;
                    eraVacio[i][j] = true;
                } else {
                    tablero[i][j] = Integer.parseInt(val);
                    eraVacio[i][j] = false;
                }
            }
        }

        if (solve(tablero)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    celdas[i][j].setText(String.valueOf(tablero[i][j]));
                    if (eraVacio[i][j]) {
                        celdas[i][j].setForeground(new Color(41, 128, 185)); // Azul para los resueltos
                    } else {
                        celdas[i][j].setForeground(Color.BLACK); // Negro para los originales
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No tiene solución. Revisa los números.");
        }
    }

    private boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) return true;
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || 
                board[3*(row/3) + i/3][3*(col/3) + i%3] == num) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SudokuPopup().setVisible(true));
    }
}