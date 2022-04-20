package innovaccion.clase2.herencia;

public class Empleado extends Persona{

    double salario;

    Empleado(int id, String nombre, double salario){
        super(id, nombre);
        this.salario = salario;
    }

    public void display(){
        System.out.println(id+" "+nombre+" "+salario);
    }
}
