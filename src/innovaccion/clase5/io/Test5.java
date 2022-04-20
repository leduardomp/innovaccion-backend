package innovaccion.clase5.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test5 {

    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("./test/magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            String s = "Hola mundo desde innovaccion";
            byte b[] = s.getBytes(StandardCharsets.UTF_8);

            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();

            System.out.println("Ready");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
