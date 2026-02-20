package UNIDAD2;

import java.util.Scanner;

public class Aburrimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rueda1 = 0;
        int rueda2 = 0;
        int rueda3 = 0;

        int caracol1posicion = 0;
        int caracol2posicion = 0;
        int caracol3posicion = 0;

        int apuesta1 = 0;
        int apuesta2 = 0;
        int apuesta3 = 0;
        double dineroGanado = 0;

        int posicion = 0;

        String caracol1 = "";
        String caracol2 = "";
        String caracol3 = "";

        double dinero = 100;
        String continuar = "si";

        int contador0caracol1 = 0;
        int contador0caracol2 = 0;
        int contador0caracol3 = 0;

        int contador2caracol1 = 0;
        int contador2caracol2 = 0;
        int contador2caracol3 = 0;

        System.out.print("Apuesta caracol 1: ");
        apuesta1 = teclado.nextInt();

        while (apuesta1 > dinero) {
            System.out.print("Apuesta caracol 1: ");
            apuesta1 = teclado.nextInt();
        }

        dinero = dinero - apuesta1;

        System.out.print("Apuesta caracol 2: ");
        apuesta2 = teclado.nextInt();

        while (apuesta2 > dinero) {
            System.out.print("Apuesta caracol 2: ");
            apuesta2 = teclado.nextInt();
        }

        dinero = dinero - apuesta2;

        System.out.print("Apuesta caracol 3: ");
        apuesta3 = teclado.nextInt();

        while (apuesta3 > dinero) {
            System.out.print("Apuesta caracol 1: ");
            apuesta3 = teclado.nextInt();
        }

        dinero = dinero - apuesta3;

        while (continuar.equalsIgnoreCase("si")) {
            posicion = (int)(Math.random() * 3);
            if (posicion == 0) {
                contador0caracol1++;
            } else if (contador0caracol1 == 2) {
                posicion = 0;
                contador0caracol1 = 0;
            } else {
                contador0caracol1 = 0;
            }

            if (posicion == 2) {
                contador2caracol1++;
            } else if (contador2caracol1 == 2) {
                posicion = 4;
                contador2caracol1 = 0;
            } else {
                contador2caracol1 = 0;
            }

            caracol1posicion = caracol1posicion + posicion;

            posicion = (int)(Math.random() * 3);
            if (posicion == 0) {
                contador0caracol2++;
            } else if (contador0caracol2 == 2) {
                posicion = 0;
                contador0caracol2 = 0;
            } else {
                contador0caracol2 = 0;
            }

            if (posicion == 2) {
                contador2caracol2++;
            } else if (contador2caracol2 == 2) {
                posicion = 4;
                contador2caracol2 = 0;
            } else {
                contador2caracol2 = 0;
            }

            caracol2posicion = caracol2posicion + posicion;

            posicion = (int)(Math.random() * 3);
            if (posicion == 0) {
                contador0caracol3++;
            } else if (contador0caracol3 == 2) {
                posicion = 0;
                contador0caracol3 = 0;
            } else {
                contador0caracol3 = 0;
            }

            if (posicion == 2) {
                contador2caracol3++;
            } else if (contador2caracol3 == 2) {
                posicion = 4;
                contador2caracol3 = 0;
            } else {
                contador2caracol3 = 0;
            }

            caracol3posicion = caracol3posicion + posicion;

            caracol1 = "Caracol 1 -> START:";
            caracol2 = "Caracol 2 -> START:";
            caracol3 = "Caracol 3 -> START:";

            for (int x = 0; x < 30; x++) {
                if (x == caracol1posicion) {
                    caracol1 = caracol1 + "@";
                } else {
                    caracol1 = caracol1 + "_";
                }

                if (x == caracol2posicion) {
                    caracol2 = caracol2 + "@";
                } else {
                    caracol2 = caracol2 + "_";
                }

                if (x == caracol3posicion) {
                    caracol3 = caracol3 + "@";
                } else {
                    caracol3 = caracol3 + "_";
                }
            }

            caracol1 = caracol1 + "[META]";
            caracol2 = caracol2 + "[META]";
            caracol3 = caracol3 + "[META]";

            System.out.println(caracol1);
            System.out.println(caracol2);
            System.out.println(caracol3);

            if (caracol1posicion < 30 && caracol2posicion < 30 && caracol3posicion < 30) {
                System.out.print("Siguiente: ");
                continuar = teclado.next();
                continuar = "si";
                
            } else {
                continuar = "no";
            }

            System.out.println();
        }

        if (caracol1posicion > caracol2posicion && caracol1posicion > caracol3posicion) {
            apuesta1 = apuesta1 * 5;
            apuesta2 = 0;
            apuesta3 = 0;
            System.out.println("Ha ganado el caracol 1 y en la apuesta ha acabado con " + apuesta1 + " euros.");
        } else if (caracol2posicion > caracol3posicion) {
            apuesta2 = apuesta2 * 5;
            apuesta1 = 0;
            apuesta3 = 0;
            System.out.println("Ha ganado el caracol 2 y en la apuesta ha acabado con " + apuesta2 + " euros.");
        } else {
            apuesta3 = apuesta3 * 5;
            apuesta2 = 0;
            apuesta1 = 0;
            System.out.println("Ha ganado el caracol 3 y en la apuesta ha acabado con " + apuesta3 + " euros.");
        }

        dineroGanado = apuesta1 + apuesta2 + apuesta3;

        System.out.print("Desea apostar todo el dinero que ha ganado en una sola ronda de las tragaperras? ");
        continuar = teclado.next();

        if (continuar.equalsIgnoreCase("si")) {
            rueda1 = (int)(Math.random() * 7) + 1;
            rueda2 = (int)(Math.random() * 7) + 1;
            rueda3 = (int)(Math.random() * 7) + 1;

            System.out.println(rueda1 + " | " + rueda2 + " | " + rueda3);

            if (rueda1 == rueda2 && rueda1 == rueda3) {
                dineroGanado = dineroGanado * rueda1;
            } else if (rueda1 == rueda2 || rueda1 == rueda3) {
                dineroGanado = dineroGanado * (rueda1 / 2);
            } else if (rueda2 == rueda3) {
                dineroGanado = dineroGanado * (rueda2 / 2);
            } else {
                dineroGanado = 0;
            }
        }

        dinero = dinero + dineroGanado;
        System.out.println("Ha acabado con " + dinero + " euros.");

        teclado.close();
    }
}
