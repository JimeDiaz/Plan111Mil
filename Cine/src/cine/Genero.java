package cine;

public class Genero {
   private Integer id; //aca id esta tomado como un objeto.
   private String nombre;
   
   //Constructor por defecto
   public Genero(){
   }
   
   //Este constructor incluye todos los atributos de la clase
   public Genero(String nombre){
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
   
   //Sobre escribe el método toString, le dice a Java que está bien lo que le estoy diciendo.
   @Override
   public String toString(){
       return this.nombre;
   }
}