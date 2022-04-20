package innovaccion.clase5.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream archivo = new FileOutputStream("./test/holaHilo.txt");
                    archivo.write(65);
                    archivo.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
