/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.IOnOff;

/**
 *
 * @author capacitacion06
 */
public class Auto implements IOnOff { // al escribir esta linea en el foco: add import for Interface.IOnOff
    
    private String modelo;

    public Auto(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
           System.out.println("El auto se encendio");
    }

    @Override
    public void apagar() {
        System.out.println("El auto se apago");
    }

    
}
