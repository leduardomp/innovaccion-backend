package innovaccion.clase4;

public class TestS extends Thread{
    @Override
    public void run() {
        for (int i = 1; i<=10; i++){
            try {
                Thread.sleep(500);
                System.out.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestS testS = new TestS();
        testS.start();

        HiloS hiloS = new HiloS();
        Thread thread = new Thread(hiloS);
        thread.start();
    }
}

class HiloS implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<=10; i++){
            try {
                Thread.sleep(500);
                System.out.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
