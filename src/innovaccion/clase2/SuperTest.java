package innovaccion.clase2;

class Animal {
    String color = "Blanco";

    void eat(){
        System.out.println("Comiendo..");
    }

    Animal(){
        System.out.println("Se a creado un animal");
    }
}

class Gato extends Animal{
    String color = "Gris";

    void printColor(){
        System.out.println("Color de la clase gato:"+ color);
        System.out.println("Color de la clase Animal:"+super.color);
    }

    void eat(){
        System.out.println("Come atún");
    }

    void dormir(){
        System.out.println("Ya se durmio el michi");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("Se a creado un gato");
    }
}

public class SuperTest{

    public static void main(String[] args) {
        /*

        new Gato().printColor();

        new Gato().eat();

        new Gato().call();

         */

        new Gato();
    }
}
