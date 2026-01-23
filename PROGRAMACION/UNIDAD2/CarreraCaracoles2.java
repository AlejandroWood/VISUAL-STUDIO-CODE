package UNIDAD2;

import java.util.Scanner;

public class CarreraCaracoles2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caracol1 = 0;
        int caracol2 = 0;
        int caracol3 = 0;
        int cantidad = 0;

        int tiradaCaracol1 = 0;
        int tiradaCaracol2 = 0;
        int tiradaCaracol3 = 0;

        int contador0_1 = 0;
        int contador0_2 = 0;
        int contador0_3 = 0;

        int contador3_1 = 0;
        int contador3_2 = 0;
        int contador3_3 = 0;

        int contador = 0;
        String caracol1String = "Caracol 1: ";
        String caracol2String = "Caracol 2: ";
        String caracol3String = "Caracol 3: ";
        String estado = "";

        boolean ganador = true;
        String continuar = "Si";

        System.out.println("Bienvenido a la carrera de caracoles");
        System.out.print("Diga (Si) para empezar: ");
        continuar = teclado.next();
        continuar = "Si";

        System.out.print("Cántidad de jugadores que van a jugar: ");
        cantidad = teclado.nextInt();

        String[] jugadores = new String[cantidad];
        int[] dinero = new int[cantidad];
        int[] apuestaCaracol = new int[cantidad];
        int apuesta = 0;
        int total = 0;

        for (int x = 0; x <= (cantidad - 1);  x++) {
            System.out.println();
            System.out.println("Jugador " + (x + 1) + ":");;
            System.out.print("Introduzca su nombre: ");
            jugadores[x] = teclado.next();
            dinero[x] = 100;
            System.out.println(jugadores[x] + " tiene " + dinero[x] + " euros.");
        }

        while (continuar.equalsIgnoreCase("si")) {
            apuesta = 0;
            total = 0;
            tiradaCaracol1 = 0;
            tiradaCaracol2 = 0;
            tiradaCaracol3 = 0;

            contador0_1 = 0;
            contador0_2 = 0;
            contador0_3 = 0;

            contador3_1 = 0;
            contador3_2 = 0;
            contador3_3 = 0;

            contador = 0;
            caracol1String = "Caracol 1: ";
            caracol2String = "Caracol 2: ";
            caracol3String = "Caracol 3: ";
            estado = "";

            ganador = true;
            caracol1 = 0;
            caracol2 = 0;
            caracol3 = 0;
            System.out.println();
            
            for (int x = 0;  x <= (cantidad -1); x++) {
                System.out.print("Cantidad que " + jugadores[x] + " quiere apostar. (Tiene " + dinero[x] + " euros): ");
                apuesta = teclado.nextInt();
                while (apuesta > dinero[x]) {
                    System.out.print("No puede apostar una cantidad de dinero mayor a la que dispone, introduzca otra apuesta: ");
                    apuesta = teclado.nextInt();
                }

                dinero[x] = dinero[x] - apuesta;
                total = total + apuesta;
                System.out.println();

                System.out.print("Introduca el número del caracol por el que quiere apostar: ");
                apuestaCaracol[x] = teclado.nextInt();

                while (apuestaCaracol[x] < 1 || apuestaCaracol[x] > 3) {
                    System.out.print("Introduzca un número válido: ");
                    apuestaCaracol[x] = teclado.nextInt();
                }
                System.out.println();
            }

                while (ganador) {
                    tiradaCaracol1 = (int) (Math.random() * 4);
                    tiradaCaracol2 = (int) (Math.random() * 4);
                    tiradaCaracol3 = (int) (Math.random() * 4);

                    caracol1String = "Caracol 1: ";
                    caracol2String = "Caracol 2: ";
                    caracol3String = "Caracol 3: ";

                    if (contador0_1 == 2) {
                        tiradaCaracol1 = 0;
                        estado = " Se ha quedado dormido.";
                        contador0_1 = 0;
                    } else if (tiradaCaracol1 == 0) {
                        contador0_1++;
                    } else {
                        contador0_1 = 0;
                    }
                    if (tiradaCaracol1 == 3) {
                        contador3_1++;
                    } else {
                        contador3_1 = 0;
                    }
                    if (contador3_1 == 2) {
                        tiradaCaracol1 = tiradaCaracol1 + 2;
                        estado = " Ha recibido un turbo.";
                        contador3_1 = 0;
                    }

                    caracol1 = caracol1 + tiradaCaracol1;

                    contador = 0;

                    while (contador <= 30) {
                        if ((contador > caracol1 || contador < caracol1) && contador < 30) {
                            caracol1String = caracol1String + "_";
                        } else if (contador == 30) {
                            caracol1String = caracol1String + "[META]";
                        } else {
                            caracol1String = caracol1String + "@";
                        }
                        contador++;
                    }

                    System.out.println(caracol1String + " avanza " + tiradaCaracol1 + " puestos." + estado);
                    estado = "";

                    if (contador0_2 == 2) {
                        tiradaCaracol2 = 0;
                        estado = " Se ha quedado dormido.";
                        contador0_2 = 0;
                    } else if (tiradaCaracol2 == 0) {
                        contador0_2++;
                    } else {
                        contador0_2 = 0;
                    }
                    if (tiradaCaracol2 == 3) {
                        contador3_2++;
                    } else {
                        contador3_2 = 0;
                    }
                    if (contador3_2 == 2) {
                        tiradaCaracol2 = tiradaCaracol2 + 2;
                        estado = " Ha recibido un turbo.";
                        contador3_2 = 0;
                    }

                    caracol2 = caracol2 + tiradaCaracol2;

                    contador = 0;

                    while (contador <= 30) {
                        if ((contador > caracol2 || contador < caracol2) && contador < 30) {
                            caracol2String = caracol2String + "_";
                        } else if (contador == 30) {
                            caracol2String = caracol2String + "[META]";
                        } else {
                            caracol2String = caracol2String + "@";
                        }
                        contador++;
                    }

                    System.out.println(caracol2String + " avanza " + tiradaCaracol2 + " puestos." + estado);
                    estado = "";

                    if (contador0_3 == 2) {
                        tiradaCaracol3 = 0;
                        estado = " Se ha quedado dormido.";
                        contador0_3 = 0;
                    } else if (tiradaCaracol3 == 0) {
                        contador0_3++;
                    } else {
                        contador0_3 = 0;
                    }
                    if (tiradaCaracol3 == 3) {
                        contador3_3++;
                    } else {
                        contador3_3 = 0;
                    }
                    if (contador3_3 == 2) {
                        tiradaCaracol3 = tiradaCaracol3 + 2;
                        estado = " Ha recibido un turbo.";
                        contador3_3 = 0;
                    }

                    caracol3 = caracol3 + tiradaCaracol3;

                    contador = 0;

                    while (contador <= 30) {
                        if ((contador > caracol3 || contador < caracol3) && contador < 30) {
                            caracol3String = caracol3String + "_";
                        } else if (contador == 30) {
                            caracol3String = caracol3String + "[META]";
                        } else {
                            caracol3String = caracol3String + "@";
                        }
                        contador++;
                    }

                    System.out.println(caracol3String + " avanza " + tiradaCaracol3 + " puestos." + estado);
                    estado = "";

                    if (caracol1 >= 30 || caracol2 >= 30 || caracol3 >= 30) {
                        ganador = false;
                    } else {
                    System.out.print("Diga (Si) para continuar: ");
                    continuar = teclado.next();
                    continuar = "Si";
                    }

                    System.out.println();

                }


                int caracolGanador = 0;
                String primerPuesto = "";
                if (caracol1 > caracol2 && caracol1 > caracol3) {
                    primerPuesto = "caracol 1.";
                    caracolGanador = 1;
                } else if (caracol2 > caracol3) {
                    primerPuesto = "caracol 2.";
                    caracolGanador = 2;
                } else {
                    primerPuesto = "caracol 3.";
                    caracolGanador = 3;
                }

                System.out.println("Ha ganado el " + primerPuesto);

                int contador2 = 0;

                System.out.println("Jugadores que han ganado la apuesta:");
                for (int x = 0; x < cantidad; x++) {
                    if (apuestaCaracol[x] == caracolGanador) {
                        System.out.println(jugadores[x]);
                        contador2++;
                    }
                }
                if (contador2 == 0) {
                    System.out.println("Nadie");
                }
                contador2 = 0;
                System.out.println();

                for (int x = 0; x < cantidad; x++) {
                    if (apuestaCaracol[x] == caracolGanador) {
                        dinero[x] = dinero[x] + total;
                        System.out.println(jugadores[x] + " ha ganado la apuesta y ahora tiene " + dinero[x] + " euros." );
                    } else {
                        System.out.println(jugadores[x] + " ha perdido la apuesta y ahora tiene " + dinero[x] + " euros." );
                    }
                }

                total = 0;

                System.out.print("Introduzca (Si) si quiere volver a jugar: ");
                continuar = teclado.next();

                for (int x = 0; x < cantidad; x++) {
                    if (dinero[x] == 0 && continuar.equalsIgnoreCase("si")){
                        continuar = "No";
                        System.out.println("A uno de los jugadores no le queda dinero y no se podrá jugar otra vez.");
                    }
                System.out.println();
                }
                System.out.println("Adios");
            }
        teclado.close();

    }
}
