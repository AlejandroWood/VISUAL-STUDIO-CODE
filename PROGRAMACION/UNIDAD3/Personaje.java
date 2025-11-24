package UNIDAD3;

public class Personaje {

    

    private String nombre;
    private int vida;
    private int armadura;
    protected int creditos;

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