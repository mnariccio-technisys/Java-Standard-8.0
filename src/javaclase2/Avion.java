package javaclase2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Avion extends VehiculoMotorizado{
    
    public Avion(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Acerlerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
    
}
