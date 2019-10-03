package cine;

public class Actor {
    //Atributos
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo; //el atributo sexo se llama de la clase Sexo
    
    //Constructor por defecto
    public Actor(){
    }
    
    //Este constructor incluye todos los atributos de la clase Actor
    public Actor(boolean animado, String apellido, String nombre, Sexo sexo){
        this.animado=animado;
        this.apellido=apellido;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    
    //A continuacion se listan todos los metodos de seteo de cada atributo de la clase.
    //Metodos de Seteo de cada atributo de la clase
    public boolean isAnimado(){
        return animado;
    }
    public void setAnimado(boolean animado){
        this.animado=animado;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Sexo getSexo(){
        return sexo;
    }
    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    }
    //Sobre escribe el método toString, le dice a Java que está bien lo que le estoy diciendo.
    @Override 
    public String toString(){
        return nombre+" "+apellido;
    }
}
