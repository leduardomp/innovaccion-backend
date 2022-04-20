package innovaccion.clase2.herencia.multinivel;

public class Programador extends Empleado{

    int bono = 1000;

    public void main() {

        Programador luis = new Programador();

        System.out.println("El programador tiene un salario de :" + luis.salario);

        System.out.println("El programador tiene un bono de :" + luis.bono);

    }

    void mensaje(){
        System.out.println("Soy programador");
        main();
    }

}
