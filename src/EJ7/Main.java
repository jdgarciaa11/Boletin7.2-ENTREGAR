package EJ7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraccion espe = new Fraccion(2,5);
        Fraccion jesus;
        double numerador = 0, denominador;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Introduce un numerador: ");
            numerador = scan.nextDouble();
            System.out.println("Introduce un denominador: ");
            denominador = scan.nextDouble();
        }while (numerador <=0);

        jesus = new Fraccion(numerador, denominador);

        System.out.println(jesus.multiplicar(5));
        System.out.println(jesus.multiplicar(espe));
        System.out.println(jesus.dividir(2));
        System.out.println(jesus.dividir(espe));
        System.out.println(jesus.simplificar());
    }
}
