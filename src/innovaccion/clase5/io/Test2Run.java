package innovaccion.clase5.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2Run {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {

                    FileOutputStream fileOutputStream = new FileOutputStream("./test/magiaRun.txt");
                    String s = "Magia con runnable !!!";
                    byte b[] = s.getBytes(StandardCharsets.UTF_8);
                    fileOutputStream.write(b);
                    fileOutputStream.close();

                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread tr = new Thread(r1);
        tr.start();
    }
}
