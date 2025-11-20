package EXAMEN;

import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int gama = 0;
        double[][] gamaD = new double[3][3];
        int stock = 0;
        int sistemaOperativo = 0;
        int[] sistemaOperativoInt = new int[2];
        int introducirSmartphones = 0;
        int contador = 0;
        double max = 0;

        //Pide al usuario introducir cuantos smartphones desea añadir al stock
        System.out.print("Cantidad de smartphones a introducir (Como mínimo 2 y como máximo 40): ");
        introducirSmartphones = teclado.nextInt();

        //Obliga al usuario a introducir un numero entre el 2 y el 40
        while (introducirSmartphones < 2 || introducirSmartphones > 40) {
            System.out.print("Introduce una cantidad correcta: ");
            introducirSmartphones = teclado.nextInt();
        }

        String[][] smartphones = new String[introducirSmartphones][7];
        
        double[] precio = new double[introducirSmartphones];

        int[] ram = new int[introducirSmartphones];

        int[] stockInt = new int[introducirSmartphones];

        //Se encarga de hacer que el usuario introduzca el número de veces introducido la información
        for (contador = 0; contador < introducirSmartphones; contador++) {
            System.out.println("Smartphone " + (contador + 1));
            System.out.println();

            //Le pide al usuario que introduzca la marca
            System.out.print("Introduzca la marca: ");
            smartphones[contador][0] = teclado.next();
            System.out.println();

            //Le pide al usuario que introduzca el modelo
            System.out.print("Introduzca el modelo: ");
            smartphones[contador][1] = teclado.next();
            System.out.println();

            //Le pide al usuario que introduzca la gama del smartphone
            System.out.println("Intoduzca la gama del smartphone");
            System.out.print("(1 = Premium | 2 = Media Gama | 3 = Económico): ");
            gama = teclado.nextInt();

            System.out.println();

            //Obliga al usuario a elegir una gama válida
            while (gama < 1 || gama > 3) {
                System.out.println("Intoduzca una gama válida");
                System.out.print("(1 = Premium | 2 = Media Gama | 3 = Económico): ");
                gama = teclado.nextInt();
                System.out.println();
            }

            //Le pide al usuario que introduzca el precio
            System.out.print("Introduzca el precio: ");
            precio[contador] = teclado.nextDouble();
            System.out.println();

            //Obliga a que el precio sea positivo
            while (precio[contador] < 0) {
                System.out.print("Introduzca un número positivo: ");
                precio[contador] = teclado.nextDouble();
                System.out.println();
            }

            //Guarda la cantidad de smartphones de cada gama y lo guarda en la ficha técnica del smartphone
            if (gama == 1) {
                gamaD[0][0]++;
                smartphones[contador][2] = "Premium";
                gamaD[1][0] = gamaD[1][0] + precio[contador];
            } else if (gama == 2) {
                gamaD[0][1]++;
                smartphones[contador][2] = "MediaGama";
                gamaD[1][1] = gamaD[1][0] + precio[contador];
            } else {
                gamaD[0][2]++;
                smartphones[contador][2] = "Economico";
                gamaD[1][2] = gamaD[1][0] + precio[contador];
            }

            //Lo guarda en la ficha técnica
            smartphones[contador][3] = precio[contador] + " euros";

            //Le pide al usuario que introduzca el stock
            System.out.print("Introduca la cántidad de Smartphones de este tipo hay en stock: ");
            stock = teclado.nextInt();
            System.out.println();

            //Obliga a que el stock no sea negativo
            while (stock < 0) {
                System.out.print("El stock no puede ser negativo, introduzca un número válido: ");
                stock = teclado.nextInt();
                System.out.println();
            }

            //Lo guarda en la ficha técnica
            smartphones[contador][4] = stock + " en stock";
            stockInt[contador] = stock;

            //Le pide al usuario que introduzca la cántidad de RAM del Smartphone
            System.out.println("Introduce la cántidad de RAM (en GB) del Smartphone");
            System.out.print("(4 | 6 | 8 | 12 | 16): ");
            ram[contador] = teclado.nextInt();

            System.out.println();

            //Obliga al usuario a introducir una cántidad de RAM correcta
            while (ram[contador] < 4 || ram[contador] > 16 || ram[contador] == 5 || ram[contador] == 7 || (ram[contador] > 8 && ram[contador] < 12) || (ram[contador] > 12 && ram[contador] < 16)) {
                System.out.println("Introduce una cántidad correcta");
                System.out.print("(4 | 6 | 8 | 12 | 16): ");
                ram[contador] = teclado.nextInt();
                System.out.println();
            } 

            //Lo guarda en la ficha técnica
            smartphones[contador][5] = ram[contador] + "GB";

            //Le pide al usuario que introduzca el Sistema Operativo
            System.out.println("Introduce el Sistema Opertativo del smartphone");
            System.out.print("(1 = Android | 2 = iOS): ");
            sistemaOperativo = teclado.nextInt();
            System.out.println();

            //Obliga al usuario a elegir un Sistema Operativo válido
            while (sistemaOperativo < 1 || sistemaOperativo > 2) {
                System.out.println("Introduce un Sistema Opertativo válido");
                System.out.print("(1 = Android | 2 = iOS): ");
                sistemaOperativo = teclado.nextInt();
                System.out.println();
            }

            //Guarda el Sistema Operativo en la ficha técnica y guarda la cántidad total de smartphones de dicho SO
            if (sistemaOperativo == 1) {
                smartphones[contador][6] = "Android";
                sistemaOperativoInt[0]++;
            } else {
                smartphones[contador][6] = "iOS";
                sistemaOperativoInt[1]++;
            }

        }

        boolean noTerminado = true;
        int seleccion = 0;

        while (noTerminado) {
            System.out.println("1. Listar marca y modelo de todos los smartphones Android con RAM >= 8GB y precio inferior a 400 euros.");
            System.out.println("2. Mostrar cuántos smartphones hay de cada gama y el precio medio de cada gama.");
            System.out.println("3. Identificar y guardar en un array los modelos con stock inferior a 5 unidades.");
            System.out.println("4. Del conjunto de smartphones Premium, ver la marca, modelo y precio y ver el que tiene más RAM.");
            System.out.println("5. Mostrar qué porcentaje del inventario total (en unidades) correspande a iOS vs Android.");
            System.out.println("6. Ha terminado.");
            System.out.print("Seleccione una opción válida: ");
            seleccion = teclado.nextInt();

            while (seleccion < 1 || seleccion > 6) {
                System.out.print("Seleccione una opción válida: ");
                seleccion = teclado.nextInt();
            }

            switch (seleccion) {
                case 1:
                    for (contador = 0; introducirSmartphones > contador; contador++) {
                        if (smartphones[contador][6] == "Android" && ram[contador] >= 8 && precio[contador] < 400) {
                            System.out.println("Marca: " + smartphones[contador][0]);
                            System.out.println("Modelo: " + smartphones[contador][1]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Premium:");
                    System.out.println("Cantidad: " + gamaD[0][0]);
                    System.out.println("Precio medio: " + (gamaD[1][0] / gamaD[0][0]));
                    System.out.println();
                    System.out.println("Media Gama:");
                    System.out.println("Cantidad: " + gamaD[0][1]);
                    System.out.println("Precio medio: " + (gamaD[1][1] / gamaD[0][1]));
                    System.out.println();
                    System.out.println("Económico:");
                    System.out.println("Cantidad: " + gamaD[0][2]);
                    System.out.println("Precio medio: " + (gamaD[1][2] / gamaD[0][2]));
                    break;
                case 3:
                    for (contador = 0; introducirSmartphones > contador; contador++) {
                        if (stockInt[contador] < 5) {
                            System.out.println(smartphones[contador][1] + " tiene " + stockInt[contador] + " unidades.");
                        }
                    }
                    break;
                case 4:
                    for (double numero : precio){
                        if (numero > max) {
                        max = numero;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Android: " + sistemaOperativoInt[0]);
                    System.out.println("iOS: " + sistemaOperativoInt[1]);
                    break;
                case 6:
                    noTerminado = false;
                    break;  
            }
            System.out.println();

        }
        

        teclado.close();
    }
}
