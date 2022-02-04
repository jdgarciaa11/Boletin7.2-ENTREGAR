package EJ7;

public class Fraccion {
    private double numerador;
    private double denominador;

    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public Fraccion multiplicar(double mult){
        return new Fraccion(this.numerador * mult,
                this.denominador);
    }

    public Fraccion multiplicar(Fraccion f){
        return new Fraccion ( this.numerador * f.getNumerador(),
        this.denominador * f.getDenominador());
    }

    public Fraccion dividir(double div){
        return new Fraccion(this.numerador * 1,
                this.denominador * div);
    }

    public Fraccion dividir(Fraccion f){
        return new Fraccion ( this.numerador * f.getDenominador(),
                this.denominador * f.getNumerador());
    }


    public double simplificar(){
        return Math.min(numerador, denominador);
    }

    @Override
    public String toString() {
        return "F: " +
                "\nNumerador: " + numerador +
                "\nDenominador: " + denominador;
    }
}
