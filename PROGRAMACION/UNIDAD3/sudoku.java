package UNIDAD3;

import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        int[][] cuadrado1 = new int[3][3];
        int[][] cuadrado2 = new int[3][3];
        int[][] cuadrado3 = new int[3][3];
        int[][] cuadrado4 = new int[3][3];
        int[][] cuadrado5 = new int[3][3];
        int[][] cuadrado6 = new int[3][3];
        int[][] cuadrado7 = new int[3][3];
        int[][] cuadrado8 = new int[3][3];
        int[][] cuadrado9 = new int[3][3];
        int x = 0;
        int y = 0;
        int numero = 0;
        String respuesta = "Si";

        Scanner teclado = new Scanner(System.in);

        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado1[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado2[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado3[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado4[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado5[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado6[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado7[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado8[y][x] = 0;
            }
        }
        
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                cuadrado9[y][x] = 0;
            }
        }

        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9");
        System.out.println("  |----------------------------------");
        System.out.println("1 | " + cuadrado1[0][0] + "   " + cuadrado1[0][1] + "   " + cuadrado1[0][2] + " | " + cuadrado2[0][0] + "   " + cuadrado2[0][1] + "   " + cuadrado2[0][2] + " | " + cuadrado3[0][0] + "   " + cuadrado3[0][1] + "   " + cuadrado3[0][2]);
        System.out.println("2 | " + cuadrado1[1][0] + "   " + cuadrado1[1][1] + "   " + cuadrado1[1][2] + " | " + cuadrado2[1][0] + "   " + cuadrado2[1][1] + "   " + cuadrado2[1][2] + " | " + cuadrado3[1][0] + "   " + cuadrado3[1][1] + "   " + cuadrado3[1][2]);
        System.out.println("3 | " + cuadrado1[2][0] + "   " + cuadrado1[2][1] + "   " + cuadrado1[2][2] + " | " + cuadrado2[2][0] + "   " + cuadrado2[2][1] + "   " + cuadrado2[2][2] + " | " + cuadrado3[2][0] + "   " + cuadrado3[2][1] + "   " + cuadrado3[2][2]);
        System.out.println("  |----------------------------------");
        System.out.println("4 | " + cuadrado4[0][0] + "   " + cuadrado4[0][1] + "   " + cuadrado4[0][2] + " | " + cuadrado5[0][0] + "   " + cuadrado5[0][1] + "   " + cuadrado5[0][2] + " | " + cuadrado6[0][0] + "   " + cuadrado6[0][1] + "   " + cuadrado6[0][2]);
        System.out.println("5 | " + cuadrado4[1][0] + "   " + cuadrado4[1][1] + "   " + cuadrado4[1][2] + " | " + cuadrado5[1][0] + "   " + cuadrado5[1][1] + "   " + cuadrado5[1][2] + " | " + cuadrado6[1][0] + "   " + cuadrado6[1][1] + "   " + cuadrado6[1][2]);
        System.out.println("6 | " + cuadrado4[2][0] + "   " + cuadrado4[2][1] + "   " + cuadrado4[2][2] + " | " + cuadrado5[2][0] + "   " + cuadrado5[2][1] + "   " + cuadrado5[2][2] + " | " + cuadrado6[2][0] + "   " + cuadrado6[2][1] + "   " + cuadrado6[2][2]);
        System.out.println("  |----------------------------------");
        System.out.println("7 | " + cuadrado7[0][0] + "   " + cuadrado7[0][1] + "   " + cuadrado7[0][2] + " | " + cuadrado8[0][0] + "   " + cuadrado8[0][1] + "   " + cuadrado8[0][2] + " | " + cuadrado9[0][0] + "   " + cuadrado9[0][1] + "   " + cuadrado9[0][2]);
        System.out.println("8 | " + cuadrado7[1][0] + "   " + cuadrado7[1][1] + "   " + cuadrado7[1][2] + " | " + cuadrado8[1][0] + "   " + cuadrado8[1][1] + "   " + cuadrado8[1][2] + " | " + cuadrado9[1][0] + "   " + cuadrado9[1][1] + "   " + cuadrado9[1][2]);
        System.out.println("9 | " + cuadrado7[2][0] + "   " + cuadrado7[2][1] + "   " + cuadrado7[2][2] + " | " + cuadrado8[2][0] + "   " + cuadrado8[2][1] + "   " + cuadrado8[2][2] + " | " + cuadrado9[2][0] + "   " + cuadrado9[2][1] + "   " + cuadrado9[2][2]);
        
        while (respuesta.equals("Si")) {
            System.out.print("Introduzca la coordenada x: ");
            x = teclado.nextInt();
            System.out.println();

            while (x < 1 || x > 9) {
                System.out.print("Introduzca la coordenada x: ");
                x = teclado.nextInt();
                System.out.println();
            }

            System.out.print("Introduzca la coordenada y: ");
            y = teclado.nextInt();
            System.out.println();

            while (y < 1 || y > 9) {
                System.out.print("Introduzca la coordenada y: ");
                y = teclado.nextInt();
                System.out.println();
            }

            System.out.print("Introduzca un número entre el 1 y el 9: ");
            numero = teclado.nextInt();
            System.out.println();

            while (numero < 1 || numero > 9) {
                System.out.print("Introduzca un número entre el 1 y el 9: ");
                numero = teclado.nextInt();
                System.out.println();
            }

            if (x < 4 && y < 4) {
                x = x - 1;
                y = y - 1;
                cuadrado1[y][x] = numero;
            }
            if (x > 3 && x < 7 && y < 4) {
                x = x - 4;
                y = y - 1;
                cuadrado2[y][x] = numero;
            }
            if (x > 6 && y < 4) {
                x = x - 7;
                y = y - 1;
                cuadrado3[y][x] = numero;
            }
            if (x < 4 && y < 7 && y > 3) {
                x = x - 1;
                y = y - 4;
                cuadrado4[y][x] = numero;
            }
            if (x > 3 && x < 7 && y < 7 && y > 3) {
                x = x - 4;
                y = y - 4;
                cuadrado5[y][x] = numero;
            }
            if (x > 6 && y < 7 && y > 3) {
                x = x - 7;
                y = y - 4;
                cuadrado6[y][x] = numero;
            }
            if (x < 4 &&  y > 6) {
                x = x - 1;
                y = y - 7;
                cuadrado7[y][x] = numero;
            }
            if (x > 3 && x < 7 &&  y > 6) {
                x = x - 4;
                y = y - 7;
                cuadrado8[y][x] = numero;
            }
            if (x > 6 && y > 6) {
                x = x - 7;
                y = y - 7;
                cuadrado9[y][x] = numero;
            }

            System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9");
            System.out.println("  |----------------------------------");
            System.out.println("1 | " + cuadrado1[0][0] + "   " + cuadrado1[0][1] + "   " + cuadrado1[0][2] + " | " + cuadrado2[0][0] + "   " + cuadrado2[0][1] + "   " + cuadrado2[0][2] + " | " + cuadrado3[0][0] + "   " + cuadrado3[0][1] + "   " + cuadrado3[0][2]);
            System.out.println("2 | " + cuadrado1[1][0] + "   " + cuadrado1[1][1] + "   " + cuadrado1[1][2] + " | " + cuadrado2[1][0] + "   " + cuadrado2[1][1] + "   " + cuadrado2[1][2] + " | " + cuadrado3[1][0] + "   " + cuadrado3[1][1] + "   " + cuadrado3[1][2]);
            System.out.println("3 | " + cuadrado1[2][0] + "   " + cuadrado1[2][1] + "   " + cuadrado1[2][2] + " | " + cuadrado2[2][0] + "   " + cuadrado2[2][1] + "   " + cuadrado2[2][2] + " | " + cuadrado3[2][0] + "   " + cuadrado3[2][1] + "   " + cuadrado3[2][2]);
            System.out.println("  |----------------------------------");
            System.out.println("4 | " + cuadrado4[0][0] + "   " + cuadrado4[0][1] + "   " + cuadrado4[0][2] + " | " + cuadrado5[0][0] + "   " + cuadrado5[0][1] + "   " + cuadrado5[0][2] + " | " + cuadrado6[0][0] + "   " + cuadrado6[0][1] + "   " + cuadrado6[0][2]);
            System.out.println("5 | " + cuadrado4[1][0] + "   " + cuadrado4[1][1] + "   " + cuadrado4[1][2] + " | " + cuadrado5[1][0] + "   " + cuadrado5[1][1] + "   " + cuadrado5[1][2] + " | " + cuadrado6[1][0] + "   " + cuadrado6[1][1] + "   " + cuadrado6[1][2]);
            System.out.println("6 | " + cuadrado4[2][0] + "   " + cuadrado4[2][1] + "   " + cuadrado4[2][2] + " | " + cuadrado5[2][0] + "   " + cuadrado5[2][1] + "   " + cuadrado5[2][2] + " | " + cuadrado6[2][0] + "   " + cuadrado6[2][1] + "   " + cuadrado6[2][2]);
            System.out.println("  |----------------------------------");
            System.out.println("7 | " + cuadrado7[0][0] + "   " + cuadrado7[0][1] + "   " + cuadrado7[0][2] + " | " + cuadrado8[0][0] + "   " + cuadrado8[0][1] + "   " + cuadrado8[0][2] + " | " + cuadrado9[0][0] + "   " + cuadrado9[0][1] + "   " + cuadrado9[0][2]);
            System.out.println("8 | " + cuadrado7[1][0] + "   " + cuadrado7[1][1] + "   " + cuadrado7[1][2] + " | " + cuadrado8[1][0] + "   " + cuadrado8[1][1] + "   " + cuadrado8[1][2] + " | " + cuadrado9[1][0] + "   " + cuadrado9[1][1] + "   " + cuadrado9[1][2]);
            System.out.println("9 | " + cuadrado7[2][0] + "   " + cuadrado7[2][1] + "   " + cuadrado7[2][2] + " | " + cuadrado8[2][0] + "   " + cuadrado8[2][1] + "   " + cuadrado8[2][2] + " | " + cuadrado9[2][0] + "   " + cuadrado9[2][1] + "   " + cuadrado9[2][2]);

            System.out.println("Desea seguir?");
            System.out.print("(Si | No): ");
            respuesta = teclado.next();

            while (!(respuesta.equals("Si") || respuesta.equals("No"))) {
                System.out.println("Desea seguir?");
                System.out.print("(Si | No): ");
                respuesta = teclado.next();
            }
        }

            int[][] contadorCuadrado1 = new int[3][3];
            int[][] contadorCuadrado2 = new int[3][3];
            int[][] contadorCuadrado3 = new int[3][3];
            int[][] contadorCuadrado4 = new int[3][3];
            int[][] contadorCuadrado5 = new int[3][3];
            int[][] contadorCuadrado6 = new int[3][3];
            int[][] contadorCuadrado7 = new int[3][3];
            int[][] contadorCuadrado8 = new int[3][3];
            int[][] contadorCuadrado9 = new int[3][3];

            for (y = 0; y < 3; y++) {
                for (x = 0; x < 3; x++) {
                    if (cuadrado1[y][x] > 0) {
                        contadorCuadrado1[y][x] = cuadrado1[y][x];
                    } else if (cuadrado1[y][x] == 0) {
                        contadorCuadrado1[y][x] = 10;
                    }

                    if (cuadrado2[y][x] > 0) {
                        contadorCuadrado2[y][x] = cuadrado2[y][x];
                    } else if (cuadrado2[y][x] == 0) {
                        contadorCuadrado2[y][x] = 10;
                    }

                    if (cuadrado3[y][x] > 0) {
                        contadorCuadrado3[y][x] = cuadrado3[y][x];
                    } else if (cuadrado3[y][x] == 0) {
                        contadorCuadrado3[y][x] = 10;
                    }

                    if (cuadrado4[y][x] > 0) {
                        contadorCuadrado4[y][x] = cuadrado4[y][x];
                    } else if (cuadrado4[y][x] == 0) {
                        contadorCuadrado4[y][x] = 10;
                    }

                    if (cuadrado5[y][x] > 0) {
                        contadorCuadrado5[y][x] = cuadrado5[y][x];
                    } else if (cuadrado5[y][x] == 0) {
                        contadorCuadrado5[y][x] = 10;
                    }

                    if (cuadrado6[y][x] > 0) {
                        contadorCuadrado6[y][x] = cuadrado6[y][x];
                    } else if (cuadrado6[y][x] == 0) {
                        contadorCuadrado6[y][x] = 10;
                    }

                    if (cuadrado7[y][x] > 0) {
                        contadorCuadrado7[y][x] = cuadrado7[y][x];
                    } else if (cuadrado7[y][x] == 0) {
                        contadorCuadrado7[y][x] = 10;
                    }

                    if (cuadrado8[y][x] > 0) {
                        contadorCuadrado8[y][x] = cuadrado8[y][x];
                    } else if (cuadrado8[y][x] == 0) {
                        contadorCuadrado8[y][x] = 10;
                    }

                    if (cuadrado9[y][x] > 0) {
                        contadorCuadrado9[y][x] = cuadrado9[y][x];
                    } else if (cuadrado9[y][x] == 0) {
                        contadorCuadrado9[y][x] = 10;
                    }
                }
            }

            boolean terminado = true;
            boolean coinciden = true;

            while (terminado) {
                for (y = 0; y < 3; y++) {
                    for (x = 0; x < 3; x++) {
                        while (coinciden) {
                            
                        }
                    }
                }
            }

        teclado.close();

    }
}