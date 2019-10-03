package bicicleteria;
import java.util.ArrayList;
import java.util.Scanner;
        

public class Ventas {
    private ArrayList<Bicicleta> bicicletas= new ArrayList();
    private float ganancias;
    private Integer cantidadDeVentas;
    int i;
    String NroDeSerie;
    Scanner Teclado=new Scanner(System.in);
    
    public Ventas(){
        
    }
    
    public void addBicicleta(Bicicleta nuevaBici){
        this.bicicletas.add(nuevaBici);
    }
    
    public float getGanancias(){
        return ganancias;
    }
    public void setGanancias(float ganancias){
        this.ganancias=ganancias;
    }
    
    public String buscarBicicleta(String nroDeSerie){
        System.out.println("Ingresar número de serie a buscar");
        NroDeSerie=Teclado.next();
        for (i=0; i>=bicicletas.size();i++){
            if (NroDeSerie.equals(nroDeSerie)){
                System.out.println("Muestra datos de bici");
            } else {
                System.out.println("No existe bicicleta con ese número de serie");
            }
        }
    }
}
 