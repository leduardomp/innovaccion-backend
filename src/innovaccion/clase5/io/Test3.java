package innovaccion.clase5.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream = new FileInputStream("./test/hola.txt");
            int i = fileInputStream.read();
            System.out.println((char)i);
            fileInputStream.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
