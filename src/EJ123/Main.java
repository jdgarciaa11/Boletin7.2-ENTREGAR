package EJ123;

import EJ123.Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String matricula, marca;
        Vehiculo cocheJesus;
        System.out.print("Introduce una matricula: ");
        matricula = scan.next();
        System.out.print("Introduce una marca: ");
        marca = scan.next();
        //Tambien podriamos hacer un validador de marca aqui en el main
        cocheJesus = new Vehiculo(matricula, marca, TipoDeVehiculo.COCHE);
        Vehiculo camionPaco = new Vehiculo("0101PAC", MarcaDeVehiculo.AVENSIS, TipoDeVehiculo.CAMION);
        Vehiculo avionEsperanza = new Vehiculo("0603ESP", MarcaDeVehiculo.MERCEDES, TipoDeVehiculo.AVION);
        Vehiculo cocheLydia = new Vehiculo("0712LYD", MarcaDeVehiculo.AUDI, TipoDeVehiculo.COCHE);
        System.out.println(cocheJesus);

        cocheJesus.compareTo(cocheLydia);
        camionPaco.compareTo(avionEsperanza);
        cocheJesus.compareTo(camionPaco);
        avionEsperanza.compareTo(cocheJesus);
    }
}
