package cine;

public class Sexo {
    private String nombre; //Atributos
    public Sexo(){  //Constructor
    }
    public Sexo(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
}
