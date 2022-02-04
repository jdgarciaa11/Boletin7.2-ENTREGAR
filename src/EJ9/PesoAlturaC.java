package EJ9;

public class PesoAlturaC implements Cloneable{
    private double peso;
    private double altura;

    public PesoAlturaC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        return obj;
    }
}
