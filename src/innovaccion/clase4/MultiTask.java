package innovaccion.clase4;

public class MultiTask extends Thread{

    @Override
    public void run() {
        System.out.println("Tarea Uno");
    }

    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                t2 = new MultiTask(),
                t3 = new MultiTask();

        t1.start();
        t2.start();
        t3.start();
    }
}

class Multiasking implements Runnable{
    @Override
    public void run() {
        System.out.println("tarea uno Runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multiasking()),
                t2 = new Thread(new Multiasking()),
                t3 = new Thread(new Multiasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        t1.start();
        t2.start();
        t3.start();



        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A ");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B ");
    }
}
