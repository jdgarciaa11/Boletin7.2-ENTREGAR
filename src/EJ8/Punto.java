package EJ8;

import java.util.Objects;

public class Punto {
    private double puntoA;
    private double puntoB;

    public Punto(double puntoA, double puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public double getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(double puntoA) {
        this.puntoA = puntoA;
    }

    public double getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(double puntoB) {
        this.puntoB = puntoB;
    }

    public boolean igual(Punto x){
        return Double.compare(this.puntoA, x.getPuntoA()) == 0 && Double.compare(this.puntoB, x.getPuntoB()) == 0;
    }

    public double distancia(){
        return Math.sqrt(Math.pow(this.puntoA-0,2)+Math.pow(this.puntoB-0,2));
    }

    public double distancia(Punto p){
        return Math.sqrt(Math.pow(this.puntoA-p.getPuntoA(),2)+Math.pow(this.puntoB-p.getPuntoB(),2));
    }




}
