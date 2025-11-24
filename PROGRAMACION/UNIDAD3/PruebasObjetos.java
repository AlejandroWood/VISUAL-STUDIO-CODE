package UNIDAD3;

public class PruebasObjetos {

    public static void main(String[] args) {

        //String categoria;

        /**
         * Para crear un objeto de una clase, es igual que una variable normal
         * primero ponemos el nombre de la clase, en este caso "Personaje"
         * y despues el nombre con el que queremos llamar al objeto
         * en este caso "Fran"
         * 
         * Para poder usar un objeto primero hay que crearlo para ello se utiliza la palabra
         * reservada "new" seguida del nombre de la clase y ()
         * Esto llama al constructor por defecto.
         */
        Personaje fran = new Personaje();

        fran.setNombre("Francisco");
        //fran.armadura = 100;
        fran.setVida(20);
        fran.setCreditos(0);

        System.out.println("Fran tiene " + fran.getVida() + " puntos de vida");

        fran.setVida(100);

        System.out.println("Fran tiene " + fran.getVida() + " puntos de vida");

        System.out.println("Datos de Fran: " + fran);




    }
}
