package model;

public abstract class Arbitro extends Persona implements IDesplazarseEnPistaSinPalo {
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public abstract String desplazarse();
}
