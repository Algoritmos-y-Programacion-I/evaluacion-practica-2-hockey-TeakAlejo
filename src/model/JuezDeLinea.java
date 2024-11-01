package model;

public class JuezDeLinea extends Arbitro {
    public JuezDeLinea(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String desplazarse(){
        return "Juez de Linea se desplaza sobre el hielo";
    }
}