package cine;
public class Personaje {
    private String nombreEnPelicula; //personaje
    private Actor actor; //nombre real
    private Rol rol;
    
    //Constructor por defecto
    public Personaje(){
    }
    
    public Personaje(String nombreEnPelicula, Actor personaje, Rol rol){ //personaje es el nombre real.
        this.nombreEnPelicula=nombreEnPelicula;
        this.actor=personaje; //es el nombre real q viene de la clase actor.
        this.rol=rol;
    }
    public String getNombreEnPelicula(){
        return nombreEnPelicula;
    }
    public void setNombreEnPelicula(String nombreEnPelicula){
        this.nombreEnPelicula=nombreEnPelicula;
    }
    public Actor getPersonaje(){
        return actor;
    }
    public void setPersonaje(Actor personaje){
        this.actor=personaje;
    }
    public Rol getRol(){
        return rol;
    }
    public void setRol(Rol rol){
        this.rol=rol;
    }
    @Override
    public String toString(){
        return nombreEnPelicula+" interpretado por " +actor;
    }
}