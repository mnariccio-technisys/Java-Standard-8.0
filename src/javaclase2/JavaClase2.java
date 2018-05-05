
package javaclase2;

public class JavaClase2 {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Auto("Rojo", "Ford", "Modelo");
        v1.acelerar();
        v1.frenar();
        
        Bicicleta b = new Bicicleta("Azul", "Aurora", "bla");
        b.acelerar();
        b.frenar();
        
        BicicletaPlayera b2 = new BicicletaPlayera("Negro", "Aurora", "bla");
        b2.acelerar();
        b2.frenar();
    }
    
}
