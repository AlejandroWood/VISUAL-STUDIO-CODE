package UNIDAD3;

public class Personaje {
    private String nombre;
    private int vida;
    //private int armadura;
    protected int creditos;

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

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


}