package innovaccion.clase2;

public class Bike {

    private int velocidad;
    private String color, marca;

    public Bike(){

    }
    
    public Bike(int velocidad){
        this.velocidad = velocidad;
    }

    public Bike(String color){
        this.color = color;
    }

    public Bike(int velocidad, String color){
        this.velocidad = velocidad;
        this.color = color;
    }
    
    public Bike(int velocidad, String color, String marca){
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }

}
