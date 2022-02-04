package EJ5;

public class SintonizadorFM {
    public static final double FRECUENCIA_MAXIMA = 108.00;
    public static final double FRECUENCIA_MINIMA = 80.00;
    private double frecuencia;

    public SintonizadorFM (){
        this.frecuencia = FRECUENCIA_MINIMA;
    }
    //Metodo para subir frecuencia 0.5 MHZ, he puesto como limites que
    //si la frecuencia es menor a la maxima si se pueda subar, pero si es
    //mayor a esta, vaya al extremo minimo
    public void subirFrecuencia (){
        if (this.frecuencia < FRECUENCIA_MAXIMA){
            this.frecuencia += 0.5;
        } else {
            this.frecuencia = FRECUENCIA_MINIMA;
        }
    }

    //Metodo para bajar frecuencia 0.5 MHZ, he puesto como limites que
    //si la frecuencia es mayor a la minima si se pueda restar, pero si es
    //mayor a esta, vaya al extremo maximo
    public void bajarFrecuencia (){
        if (this.frecuencia > FRECUENCIA_MINIMA){
            this.frecuencia -= 0.5;
        } else {
            this.frecuencia = FRECUENCIA_MAXIMA;
        }
    }

    @Override
    public String toString() {
        return "Frecuencia actual: " + frecuencia + " MHz";
    }
}
