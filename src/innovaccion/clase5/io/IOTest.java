package innovaccion.clase5.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream archivo = new FileOutputStream("./test/hola.txt");
            archivo.write(65);
            archivo.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
