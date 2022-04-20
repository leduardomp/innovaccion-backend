package innovaccion.clase5.vistas;

import innovaccion.imonsh.Colors;
import innovaccion.imonsh.Dialog;
import innovaccion.imonsh.Screen;

public class HolaMundo {

    public static void main(String[] args) {
        Screen screen = new Screen("Innovaccion GIU");
        screen.setVisible(true);
        screen.out("Bienvenidos a mision Backend Java");

        Dialog dialog = new Dialog();
        String str = dialog.readString("¿Quieres aprender a hacer esto?");

        if(str.charAt(0) == 'S' || str.charAt(0) == 's'){
            String pathImg = String.valueOf(screen.getClass().getResource("/img/dragonBall.jpg"));
            screen.out("\n\n");
            screen.showImage("img/dragonBall.jpg");
            screen.out("\n\nHola Explorers");
        }else{
            screen.out("\n\nTal vez en otro momento, adios", "Helvetica ", 12, Colors.BLUE);
        }
    }

}
