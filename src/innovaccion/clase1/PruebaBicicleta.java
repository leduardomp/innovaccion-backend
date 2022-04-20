package innovaccion.clase1;

public class PruebaBicicleta {

    public static void main(String[] args){
        def();
    }

    public static void def() {
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Negro");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);

        String msg = "Soy una bici de montaña con estas caracteristicas:";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();
        msg += "\nPines: "+biciMountain.getPins();
        msg += "\nRodada: "+biciMountain.getRodada();

        System.out.println(msg);
    }

}
