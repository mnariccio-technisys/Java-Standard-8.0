
package javaclase2;

public class DesplazableAMotor implements Desplazable{

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando...");
    }
    
}
