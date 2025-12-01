package UNIDAD3;

//import java.util.ArrayList;

public class Personaje {

    public static final int MAX_ARMAS = 3;
    public static final int EXITO = 0;
    public static final int FRACASO = -1;
    public static final int ERROR_CARGADO = -1;

    public static final int GUERRERO = 1;
    public static final int MAGO = 2;
    public static final int FRANCOTIRADOR = 3;

    private String nombre;
    private int vida;
    private int armadura;
    //private int clase;
    protected int creditos;

    //private ArrayList<Arma> listaArmas;

    public Personaje() {
        this.nombre = "Generado";
        this.vida = (int)(Math.random()*100)+1;
        this.armadura = 100;
        this.creditos = 30;
    }

    public Personaje(String nombre, int vida, int armadura, int creditos) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.creditos = creditos;
    }

    /**
     * Esta función recibe un arma y se la intenta asignar al personaje, los magos
     * solo
     * equipan armas de largo alcance, los francotiradores largo alcance o explosiva
     * si no lleva armadura
     * y los guerreros corto alcance y explosiva si tiene más de 20 puntos de vida.
     * Sólo puede equipar el arma si no a alacanzado la cantidad de armas máximas.
     * 
     * @param arma
     * @return
    */

    //public int equiparArma(Arma arma){
        //if ((clase == MAGO && arma.getTipo() == Arma.LARGA_DISTANCIA) 
        //|| (clase == FRANCOTIRADOR && (arma.getTipo() == Arma.LARGA_DISTANCIA 
        //|| (arma.getTipo() == Arma.EXPLOSIVA && this.armadura == 0) 
        //|| (clase == GUERRERO && (arma.getTipo() == Arma.CORTA_DISTANCIA || 
        //(arma.getTipo()==Arma.EXPLOSIVA && this.vida > 20)))))) {
            //if (listaArmas.size()<this.MAX_ARMAS){
                //this.listaArmas.add(arma);
            //} else return ERROR_CARGADO;
        //}else return FRACASO;

        //return EXITO;
    //}

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreRecibido) {
        nombre = nombreRecibido;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        String salida = "*****************************************\n";
        salida += "Nombre: " + this.nombre + "\n";
        salida += "Vida: " + this.vida + "\n";
        salida += "Armadura: " + this.armadura + "\n";
        salida += "Creditos: " + this.creditos + "\n";

        salida += "*****************************************";


        return salida;

    }

}