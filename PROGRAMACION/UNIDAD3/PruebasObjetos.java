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
        Personaje maria = new Personaje("Maria", 95, 0, 50);

        fran.setNombre("Francisco");
        fran.setArmadura(100);
        fran.setVida(20);
        fran.setCreditos(0);

        System.out.println(fran.getNombre() + " tiene " + fran.getVida() + " puntos de vida, " + fran.getArmadura() + " de armadura, " + fran.getVida() + " de vida y " + fran.getCreditos() + " creditos.");

        fran.setVida(100);

        System.out.println(fran.getNombre() + " tiene " + fran.getVida() + " puntos de vida, " + fran.getArmadura() + " de armadura, " + fran.getVida() + " de vida y " + fran.getCreditos() + " creditos.");

        System.out.println(maria.getNombre() + " tiene " + maria.getVida() + " puntos de vida, " + maria.getArmadura() + " de armadura, " + maria.getVida() + " de vida y " + maria.getCreditos() + " creditos.");

        System.out.println();

        System.out.println(fran);


    }
}
