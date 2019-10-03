package cine;

public class PaisDeOrigen {
    private Integer id;
    private String idioma;
    private String nombre;
    
    //Constructor por defecto
    public PaisDeOrigen(){
    }
    
    //Este constructor incluye todos los atributos de la clase
    public PaisDeOrigen(String idioma, String nombre){
        this.idioma=idioma;
        this.nombre=nombre;
    }
    
    //Metodos de Seteo de cada atributo de la clase
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
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
    
    //Sobre escribe el método toString, le dice a Java que está bien lo que le estoy diciendo.
    @Override
    public String toString(){
        return this.nombre;
    }
}