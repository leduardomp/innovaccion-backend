package innovaccion.clase2;

class Animal2{
    void eat(){
        System.out.println("Comiendo .... ");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal{
    @Override
    void eat() {
        System.out.println("Tomando agua");
    }
}

public class Poliformismo2 {

    public static void main(String[] args) {
        Animal junior;
        junior = new Animal();
        junior.eat();
        junior = new Dog();
        junior.eat();
        junior = new Cachorro();
        junior.eat();
    }
}
