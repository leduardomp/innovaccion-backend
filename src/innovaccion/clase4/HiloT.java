package innovaccion.clase4;

public class HiloT extends Thread{

    @Override
    public void run() {
        System.out.println("El  hilo se esta ejecutando");
    }

    public static void main(String[] args) {
        HiloT hiloT = new HiloT();
        hiloT.start();
    }

}

class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de Runnable esta corriendo");
    }

    public static void main(String[] args) {
        HilosR hilosR = new HilosR();
        Thread thread = new Thread(hilosR);
        thread.start();
    }
}