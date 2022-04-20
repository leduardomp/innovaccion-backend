package innovaccion.clase5.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("./test/magic.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);

            int i;

            while ((i = bin.read())!=-1){
                System.out.print((char)i);
            }

            bin.close();
            fis.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
