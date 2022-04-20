package innovaccion.clase4;

public class TestJoin extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin(),
        testJoin1 = new TestJoin(),
        testJoin2 = new TestJoin();

        showDetails(testJoin,testJoin1,testJoin2);

        testJoin.start();
        testJoin.join(1500);
        testJoin.setName("innovaccion");
        testJoin.setPriority(MAX_PRIORITY);

        testJoin1.start();
        testJoin2.start();

    }

    public static void showDetails(TestJoin testJoin,TestJoin testJoin1,TestJoin testJoin2){
        details(1,testJoin);
        details(2,testJoin1);
        details(3,testJoin2);
    }

    public static void details(int numHilo, TestJoin testJoin){
        System.out.println("hilo:"+numHilo+
                " Name:"+testJoin.getName()+
                " ID:"+testJoin.getId()+
                " Estado:"+testJoin.getState()+
                " Prioridad:"+testJoin.getPriority());
    }
}
