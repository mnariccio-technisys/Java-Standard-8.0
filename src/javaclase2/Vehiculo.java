package javaclase2;


public abstract class Vehiculo implements Desplazable{
    protected String color, marca, modelo;

    public Vehiculo(String color, String marca, String modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    

    public String getColor() {
        return color;
    }    
     public void setColor(String color) {
        this.color = color;
    }

     
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
}
