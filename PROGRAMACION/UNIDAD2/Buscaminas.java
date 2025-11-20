package UNIDAD2;

import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String modoJuego = "";
        int modoJuegoInt = 0;

        System.out.println("Elige un modo de juego");
        while (modoJuego == "") {
            System.out.print("(facil | intermedio | dificil): ");
            modoJuego = teclado.next();
            switch (modoJuego) {
                case "facil":
                    modoJuegoInt = 1;
                    break;
                case "intermedio":
                    modoJuegoInt = 2;
                    break;
                case "dificil":
                    modoJuegoInt = 3;
                    break;
            }

            if (modoJuegoInt == 0) {
                System.out.println("Elige un modo de juego válido");
                modoJuego = "";
            }
        }
        int numCasillas = 0;
        int numTotalCasillas = 0;
        int numMinas = 0;
        int contador = 0;

        if (modoJuegoInt == 1) {
            numCasillas = 10;
            numTotalCasillas = 100;
            numMinas = 15;
        } else if (modoJuegoInt == 2) {
            numCasillas = 20;
            numTotalCasillas = 400;
            numMinas = 40;
        } else {
            numCasillas = 25;
            numTotalCasillas = 625;
            numMinas = 99;
        }
        int[] numeroCasillas = new int[numTotalCasillas];
        int[] numeroMinas = new int[numMinas];

        for (contador=0;contador<numeroCasillas.length;contador++) {
            numeroCasillas[contador] = contador + 1;
        }

        for (contador=0;contador<numeroMinas.length;contador++) {
            numeroMinas[contador] = (int) (Math.random() * numTotalCasillas) + 1;
        }

        boolean ganando = true;
        boolean terminado = false;

        for (contador = 0; contador < (numCasillas + 1); contador++) {
            for (int contador2 = 0; contador2 < (numCasillas + 1); contador2++) {
                if (contador == 0) {
                    if (contador2 == 0) {
                        System.out.print("  ");
                    }
                    if (contador2 > 0) {
                        System.out.print(contador2 + " ");
                    }
                }
                if (contador > 0) {
                    if (contador2 == 0) {
                        System.out.print(contador + " ");
                    }
                    if (contador2 > 0) {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
        int x = 0;
        int y = 0;
        while (ganando && terminado == false) {
            numTotalCasillas = 0;
            System.out.print("Elija la coordenada x: ");
            x = teclado.nextInt();
            System.out.print("Elija la coordenada y: ");
            y = teclado.nextInt();

            while (y > 1) {
                numTotalCasillas = numTotalCasillas + numCasillas;
                y--;
            }
             while (y == 1) {
                numTotalCasillas = numTotalCasillas + x;
                y--;
            }
            numTotalCasillas--;

            contador = 0;

            while (numeroMinas.length > contador) {
                if (numeroCasillas[numTotalCasillas] == numeroMinas[contador]) {
                    ganando = false;
                }
                contador++;
            }

            if (ganando) {
                System.out.println("Ha ganado");
            } else {
                System.out.println("Ha perdido");
            }

            

        }

        teclado.close();
    }
}
