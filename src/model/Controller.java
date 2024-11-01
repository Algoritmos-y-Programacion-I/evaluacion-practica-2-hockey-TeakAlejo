package model;

import java.util.Random;

public class Controller {

    private Equipo[] memoriaEquipos;
    private Arbitro[] arbitros;
    private Arbitro[] memoriaArbitros;

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;

    private int contadorEquipos = 0;

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        memoriaEquipos = new Equipo[2];
        arbitros = new Arbitro[4];
    }

    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(4);
        int equipo2;
        do {
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2;
        fixture += "\n";

        do {
            equipo1 = random.nextInt(4);
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }

    public boolean saveArbitro(Arbitro p) {

        for (int i = 0; i < memoriaArbitros.length; i++) {

            if (memoriaArbitros[i] == null) {
                memoriaArbitros[i] = p;
                return true;
            }

        }

        return false;
    }

    public boolean saveEquipo(Equipo p) {

        for (int i = 0; i < memoriaEquipos.length; i++) {

            if (memoriaEquipos[i] == null) {
                memoriaEquipos[i] = p;
                return true;
            }

        }

        return false;

    }

    
    public void informacionPrecargada(){

        //Equipos
        Equipo equipo1 = new Equipo("Deportivo Cali Hockey");
        saveEquipo(equipo1);
        Equipo equipo2 = new Equipo("Deportivo Palmira Hockey");
        saveEquipo(equipo2);

        //Arbitros principales
        Arbitro arbitro1 = new ArbitroPrincipal("Pepito", 24);
        saveArbitro(arbitro1);
        Arbitro arbitro2 = new ArbitroPrincipal("Alejandro", 46);
        saveArbitro(arbitro2);

        //Juezes de linea
        Arbitro juez3 = new JuezDeLinea("Juanito", 17);
        saveArbitro(juez3);
        Arbitro juez4 = new JuezDeLinea("Jesus", 19);
        saveArbitro(juez4);

        
    }
    

}