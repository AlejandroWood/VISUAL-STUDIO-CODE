package UNIDAD2;

import java.util.Scanner;

public class Sudoku {

    // 9x9 board for Sudoku, 0 represents an empty cell.
    private static int[][] board = new int[9][9];
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exitProgram = false;

        System.out.println("--- RESOLVEDOR DE SUDOKU ---");
        
        while (!exitProgram) {
            
            displayBoard();
            
            System.out.println("\n----------------------------------------------------");
            System.out.println("1. Introducir/Cambiar número en una posición");
            System.out.println("2. Borrar todo el tablero");
            System.out.println("3. Resolver Sudoku automáticamente");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            
            int option = readIntInput(1, 4);
            
            if (option == 1) {
                inputNumber();
            } else if (option == 2) {
                clearBoard();
            } else if (option == 3) {
                solveBoard();
            } else if (option == 4) {
                exitProgram = true;
                System.out.println("Gracias por usar el resolvedor de Sudoku. ¡Hasta pronto!");
            }
        }
        
        teclado.close();
    }

    // --- Métodos de Interfaz de Usuario ---

    /** Muestra el tablero de Sudoku formateado. */
    private static void displayBoard() {
        System.out.println("\n  +-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            System.out.print("  |");
            for (int j = 0; j < 9; j++) {
                String displayValue = (board[i][j] == 0) ? " " : String.valueOf(board[i][j]);

                System.out.print(" " + displayValue);
                if ((j + 1) % 3 == 0) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println("  +-------+-------+-------+");
            }
        }
    }
    
    /** Lee una entrada entera dentro de un rango especificado. */
    private static int readIntInput(int min, int max) {
        int value;
        while (true) {
            if (teclado.hasNextInt()) {
                value = teclado.nextInt();
                teclado.nextLine(); // Consumir el salto de línea
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Valor fuera de rango. Introduzca un valor entre %d y %d: ", min, max);
                }
            } else {
                System.out.print("Entrada no válida. Introduzca un número: ");
                teclado.next(); // Consumir la entrada no válida
            }
        }
    }

    /** Maneja la entrada de un número para una posición específica. */
    private static void inputNumber() {
        System.out.print("Introduzca la fila (1-9): ");
        int row = readIntInput(1, 9) - 1;
        
        System.out.print("Introduzca la columna (1-9): ");
        int col = readIntInput(1, 9) - 1;

        System.out.printf("Introduzca el número para la posición (%d, %d) (1-9, o 0 para borrar): ", row + 1, col + 1);
        int number = readIntInput(0, 9);
        
        board[row][col] = number;
        System.out.printf("Posición (%d, %d) actualizada a %d.\n", row + 1, col + 1, number);
    }
    
    /** Reinicia el tablero a ceros (vacío). */
    private static void clearBoard() {
        board = new int[9][9];
        System.out.println("Tablero vaciado correctamente.");
    }

    // --- Lógica del Resolvedor ---

    /** Llama al resolvedor e imprime el resultado. */
    private static void solveBoard() {
        System.out.println("\nIntentando resolver el Sudoku...");
        if (solveSudoku()) {
            System.out.println("\n✅ SUDOKU RESUELTO CON ÉXITO:");
            displayBoard();
        } else {
            System.out.println("\n❌ ERROR: El Sudoku introducido no tiene solución válida o no es un Sudoku válido.");
        }
    }
    
    /**
     * Algoritmo de Backtracking para resolver el Sudoku.
     * Busca una celda vacía y prueba números hasta que encuentra una solución.
     */
    private static boolean solveSudoku() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                
                // Si la celda está vacía (0)
                if (board[row][col] == 0) {
                    
                    // Prueba todos los números del 1 al 9
                    for (int num = 1; num <= 9; num++) {
                        
                        // Si el número es seguro para esa posición
                        if (isSafe(row, col, num)) {
                            board[row][col] = num; // Intenta colocar el número
                            
                            // Llama recursivamente al resolvedor
                            if (solveSudoku()) {
                                return true; // ¡Solución encontrada!
                            }
                            
                            // Si la llamada recursiva falló (backtrack), 
                            // resetea la celda a 0 y prueba el siguiente número
                            board[row][col] = 0; 
                        }
                    }
                    
                    // Si probó del 1 al 9 y ninguno funcionó,
                    // esta rama de solución es inválida.
                    return false; 
                }
            }
        }
        
        // Si el bucle termina sin retornar 'false', significa que no quedan 
        // celdas vacías, por lo que el Sudoku está resuelto.
        return true; 
    }

    /** * Verifica si es seguro colocar 'num' en la posición (row, col)
     * (es decir, que no haya duplicados en fila, columna o caja 3x3).
     */
    private static boolean isSafe(int row, int col, int num) {
        
        // Comprobar la Fila
        for (int d = 0; d < 9; d++) {
            if (board[row][d] == num) {
                return false;
            }
        }
        
        // Comprobar la Columna
        for (int d = 0; d < 9; d++) {
            if (board[d][col] == num) {
                return false;
            }
        }
        
        // Comprobar la Caja 3x3
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;

        for (int r = boxRowStart; r < boxRowStart + 3; r++) {
            for (int d = boxColStart; d < boxColStart + 3; d++) {
                if (board[r][d] == num) {
                    return false;
                }
            }
        }
        
        // Si no hay conflictos, es seguro
        return true;
    }
}