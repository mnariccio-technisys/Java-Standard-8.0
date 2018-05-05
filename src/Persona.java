

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Persona {
    private int padron;
    private String nombre, apellido;
    
    public Persona(){        
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, int padron){
        this(nombre, apellido);
        this.padron = padron;
    }
}
