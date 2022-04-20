package innovaccion.clase5.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream = new FileInputStream("./test/magia.txt");
            int i = 0;

            while ((i = fileInputStream.read())!=-1){
                System.out.print((char)i);
            }

            fileInputStream.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
