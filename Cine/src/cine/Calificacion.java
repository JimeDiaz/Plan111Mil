package cine;

public class Calificacion {
    private Integer id;
    private String nombre;
    
    //Constructor por defecto
    public Calificacion(){
    }
    
    //Este constructor incluyte todos los atributos de la clase
    public Calificacion(String nombre){
        this.nombre=nombre;
    }
    
    //Metodos de Seteo de cada atributo de la clase
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}