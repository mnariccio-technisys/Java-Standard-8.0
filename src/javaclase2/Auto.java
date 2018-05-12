package javaclase2;


import javaclase2.VehiculoMotorizado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Auto extends VehiculoMotorizado{
    
    public Auto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void abrirBaul(){
        System.out.println("Abriendo baul...");
    }

    @Override
    public void acelerar() {
        System.out.println("Apretando el acelerador...");
    }

    @Override
    public void frenar() {
        System.out.println("Apretando el freno...");
    }

    @Override
    public void avanzar() {
        System.out.println("Apretando el acelerador...");
    }
    
}
