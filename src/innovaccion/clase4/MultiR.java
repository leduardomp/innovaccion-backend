package innovaccion.clase4;

public class MultiR {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task uno");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task dos");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task tres");
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
