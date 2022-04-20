package innovaccion.clase7;

import innovaccion.imonsh.Screen;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        testAshe();
    }

    private static void testAshe() throws InterruptedException {
        Ashe ashe = new Ashe(
                1,
                "Ashe",
                "Marksman",
                "Moderate",
                "Iceborn warmother"
        );

        Screen screen = new Screen();
        screen.setVisible(true);
        int timeSleep = 3000;

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {

                    ashe.crystalArrow(screen);
                    Thread.sleep(timeSleep);
                    ashe.frostShot(screen);
                    Thread.sleep(timeSleep);
                    ashe.hawkShot(screen);
                    Thread.sleep(timeSleep);
                    ashe.volley(screen);
                    Thread.sleep(timeSleep);
                    ashe.rangerFocus(screen);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread tr = new Thread(attack);
        tr.start();


    }
}
