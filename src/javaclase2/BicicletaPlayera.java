/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclase2;

public class BicicletaPlayera extends Bicicleta{
    
    public BicicletaPlayera(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void frenar() {
        System.out.println("Contrapedaleando!...");
    }    
}
