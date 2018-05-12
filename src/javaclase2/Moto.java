package javaclase2;

import javaclase2.VehiculoMotorizado;

public class Moto extends VehiculoMotorizado {
    
    private Desplazable desplazable = new DesplazableAMotor();
    
    public Moto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");        
    }

    @Override
    public void frenar() {
        desplazable.frenar();
    }

    @Override
    public void avanzar() {
        desplazable.avanzar();
    }
    
}
