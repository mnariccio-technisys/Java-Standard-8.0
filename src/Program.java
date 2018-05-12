/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Program {
    public static void main(String[] args) {
        
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        
        Persona p1 = new Persona("Juan", "Perez", 30);
        Persona p2 = new Persona("Juan", "Perez", 30);
        
        if (p1.equals(p2)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        
        int c = 10;
        int d = 10;
        
        if (a == b) {
            System.out.println("Son iguales");
        }
        for (String arg : args) {
            
        }
    }
}
