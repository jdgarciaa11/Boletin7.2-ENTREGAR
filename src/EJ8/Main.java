package EJ8;

public class Main {
    public static void main(String[] args) {
        Punto jesus = new Punto(3,4);
        Punto espe = new Punto(8,9);
        Punto jesusIgual = new Punto(3,4);

        System.out.println(jesus.distancia());
        System.out.println(espe.distancia(jesus));
        System.out.println(jesus.igual(jesusIgual));
    }
}
