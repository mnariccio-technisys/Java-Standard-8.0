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
public abstract class VehiculoMotorizado extends Vehiculo {
    
    protected String tipoCombustible;
    
    public VehiculoMotorizado(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void encender(){
        System.out.println("Encendiendo..." + modelo);
    }
    public void apagar(){
        System.out.println("Apagando.." + modelo);
    }
}
