/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Auto; //no se escribe. se agrega cuando se crea el objeto. haciendo clic en el foco.
import Clases.Computadora;
import Clases.Televisor;
import Interface.IOnOff;

/**
 *
 * @author capacitacion06
 */
public class Principal {
    public static void main(String[] args) { // psvm+tab escribe esta linea completa. 
        
        Auto auto = new Auto("Nissan"); //clic en el foco y se importa la clase utilizada.
        Computadora compu = new Computadora("VAIO");
        Televisor tel = new Televisor("Samsung");
        
        System.out.println("Metodo sin implementar polimorfismo:");
        auto.apagar(); // al solo escribir el objeto. (auto.) aparecen los metodos q utiliza.
        auto.encender();
        compu.apagar();
        compu.encender();
        tel.apagar();
        tel.encender();
        
        System.out.println("Metodo Implementando polimorfismo con Interfaz:");
        IOnOff obj =new Televisor("LG"); //usando estos metodos, con un mismo objeto se implementan diferentes clases.
        obj.apagar();
        obj.encender();
        obj = new Computadora("HP");
        obj.apagar();
        obj.encender();
        obj = new Auto("Chevrolet");
        obj.apagar();
        obj.encender();
    }
}
