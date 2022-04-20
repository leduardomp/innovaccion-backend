package innovaccion.clase2;

public class Poliformismo extends Bike2{

    @Override
    void run() {
        System.out.println("Running safely with 60 miles per hour");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Poliformismo();
        bike2.run();
    }

}
