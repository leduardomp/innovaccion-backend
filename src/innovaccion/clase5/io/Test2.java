package innovaccion.clase5.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("./test/magia.txt");
            String s = "Magia !!!";
            byte b[] = s.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(b);
            fileOutputStream.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
