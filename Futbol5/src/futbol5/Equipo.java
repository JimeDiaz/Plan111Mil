package futbol5;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<String> jugadores = new ArrayList();
    private int maxJugadores;
    
    public Equipo (String nombre, ArrayList jugadores, int maxJugadores){
        this.nombre=nombre;
        this.jugadores=jugadores;
        this.maxJugadores=maxJugadores;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public ArrayList getJugadores(){
        return jugadores;
    }
    public void addJugador(String jugador){ //metodo creado para agregar jugadores
        this.jugadores.add(jugador);
    }
    public int getMaxJugadores(){
        return maxJugadores;
    }
    public void setMaxJugadores(int maxJugadores){
        this.maxJugadores=maxJugadores;
    }
}
