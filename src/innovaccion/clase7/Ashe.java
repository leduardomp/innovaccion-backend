package innovaccion.clase7;

import innovaccion.imonsh.Colors;
import innovaccion.imonsh.Screen;

public class Ashe extends Champion implements AsheActionCallbacks{

    private String spacios = "\n\n";
    private int widthScreen = 1100;
    private int heightScreen = 800;

    Ashe(int id, String name, String role, String difficulty, String description){
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage()+spacios, "Helvetica", 16, Colors.BlueHorizon);
        screen.showImage("img/clase7/ashe/ability_0022_E1.gif");
        screen.setBounds(200,100,widthScreen,heightScreen);
    }

    @Override
    public void hawkShot(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage()+spacios, "Helvetica", 16, Colors.BlueHorizon);
        screen.showImage("img/clase7/ashe/ability_0022_P1.gif");
        screen.setBounds(200,100,widthScreen,heightScreen);
    }

    @Override
    public void rangerFocus(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage()+spacios, "Helvetica", 16, Colors.BlueHorizon);
        screen.showImage("img/clase7/ashe/ability_0022_Q1.gif");
        screen.setBounds(200,100,widthScreen,heightScreen);
    }

    @Override
    public void volley(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage()+spacios, "Helvetica", 16, Colors.BlueHorizon);
        screen.showImage("img/clase7/ashe/ability_0022_R1.gif");
        screen.setBounds(200,100,widthScreen,heightScreen);
    }

    @Override
    public void crystalArrow(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.out(showMessage()+spacios, "Helvetica", 16, Colors.BlueHorizon);
        screen.showImage("img/clase7/ashe/ability_0022_W1.gif");
        screen.setBounds(200,100,widthScreen,heightScreen);
    }
}
