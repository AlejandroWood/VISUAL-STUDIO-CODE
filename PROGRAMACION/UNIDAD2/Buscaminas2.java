package UNIDAD2;

import java.util.Scanner;

public class Buscaminas2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean terminado = false;
        int modoJuego = 0;
        int numCasillas = 0;
        boolean ganado = true;
        int numMinas = 0;
        int y = 0;
        int x = 0;

        //Pide el modo de juego
        System.out.println("Elija el modo de juego.");
        System.out.print("(Facil = 1 || Medio = 2 || Dificil = 3): ");
        modoJuego = teclado.nextInt();

        //En el caso de introducirlo mal te lo vuelve a pedir
        while (modoJuego < 1 || modoJuego > 3) {
            System.out.println("Introduzca un modo de juego valido.");
            System.out.print("(Facil = 1 || Medio = 2 || Dificil = 3): ");
            modoJuego = teclado.nextInt();
        }

        //Confirma el modo de juego
        if (modoJuego == 1) {
            numCasillas = 10;
            numMinas = 15;
        } else if (modoJuego == 2) {
            numCasillas = 20;
            numMinas = 40;
        } else {
            numCasillas = 25;
            numMinas = 99;
        }

        String[][] tablero = new String[numCasillas][numCasillas];
        int[][] tableroMinas = new int[numCasillas][numCasillas];
        for (y = 0; y < numCasillas; y++) {
            for (x = 0; x < numCasillas; x++) {
                tablero [y][x] = "*";
            }
        }
        for (y = 0; y < numCasillas; y++) {
            for (x = 0; x < numCasillas; x++) {
                tableroMinas [y][x] = 0;
            }
        }

        while (numMinas > 0) {
            y = (int)(Math.random() * numCasillas);
            x = (int)(Math.random() * numCasillas);

            if (tableroMinas[y][x] == 0) {
                tableroMinas[y][x] = 1;
                numMinas--;
            }
        }

        while (terminado == false) {
            for (y = 0; y <= numCasillas; y++) {
                for (x = 0; x <= numCasillas; x++) {
                    if (y == 0 && x == 0) {
                        System.out.print("  | ");
                    } else if (y == 0 && y < numCasillas) {
                        if (x < 10) {
                            if (x == 1) {
                                System.out.print(" " + x);
                            } else {
                                System.out.print("| " + x);
                            }
                        } else {
                            System.out.print("|" + x);
                        }
                    } else if (x == 0 && x < numCasillas) {
                        if (y < 10) {
                            System.out.print(" " + y + "| ");
                        } else {
                            System.out.print(y + "| ");
                        }
                    } else {
                        System.out.print(" " + tablero[y - 1][x - 1] + " ");
                    }
                }
                System.out.println();
            }
            y = 0;
            x = 0;
            
            System.out.print("Introduzca la posicion x: ");
            x = teclado.nextInt();

            while (x > numCasillas) {
                System.out.print("Introduzca una posicion x valida: ");
                x = teclado.nextInt();
            }

            System.out.print("Introduzca la posicion y: ");
            y = teclado.nextInt();

            while (y > numCasillas) {
                System.out.print("Introduzca una posicion y valida: ");
                y = teclado.nextInt();
            }

            if (tableroMinas[y][x] == 1){
                terminado = true;
                ganado = false;
            } else {
                
            }
        }

        if (ganado) {
            System.out.println("Ha resuelto correctamente el tablero.");
        } else {
            System.out.println("Se ha equivocado y se ha cargado el tablero.");
        }

        teclado.close();
    }
}
