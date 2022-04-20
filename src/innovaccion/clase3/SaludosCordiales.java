package innovaccion.clase3;

abstract class Hola{
    void saludar(){
        System.out.println("¿Cómo estás?, Te ves bien eh");
    }

    abstract void saludo();
}

interface Mostrar{
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar{
    @Override
    public void show() {
        System.out.println("Hola, ¿Cómo estás?, espero no del todo mal ...");
    }

    @Override
    public void despide() {
        System.out.println("Gracias, no");
    }

    public static void main(String[] args) {
        SaludosCordiales saludosCordiales = new SaludosCordiales();
        saludosCordiales.show();
        saludosCordiales.despide();
    }
}
