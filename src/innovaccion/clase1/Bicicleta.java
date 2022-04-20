package innovaccion.clase1;

public class Bicicleta {

    // Caracteristicas
    private int pins, rodada;
    private double velocidad;
    private String color;

    //Getters
    public double getVelocidad(){return this.velocidad;}
    public int getPins(){return this.pins;}
    public int getRodada(){return this.rodada;}
    public String getColor(){return this.color;}

    //Setters
    /*
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }
    */

    //Setters estilo Fer
    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        }else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return  true;
        }else
        return false;
    }

    //
    public String printState(){
        return "pins:"+this.pins+"\n"+
                "rodada:"+this.rodada+"\n"+
                "velocidad:"+this.velocidad+"\n"+
                "color:"+this.color;
    }
}
