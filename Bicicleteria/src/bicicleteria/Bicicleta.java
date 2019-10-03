
package bicicleteria;

public class Bicicleta {
    private String nroDeSerie, modelo;
    private int ano;
    private float precio;
    
    public Bicicleta(String nroDeSerie, String modelo, int ano){
        this.nroDeSerie=nroDeSerie;
        this.modelo=modelo;
        this.ano=ano;
    }
    
    public String getNroDeSerie(){
        return nroDeSerie;
    }
    public void setNroDeSerie(String nroDeSerie){//no
        this.nroDeSerie=nroDeSerie;
    }
    public String getModelo(){//no
        return modelo;
    }
    public void setModelo(String modelo){//no
        this.modelo=modelo;
    }
    public int getAno(){//no
        return ano;
    }
    public void setAno(int ano){//no
        this.ano=ano;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
}
