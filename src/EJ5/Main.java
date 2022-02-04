package EJ5;

public class Main {
    public static void main(String[] args) {
        SintonizadorFM radioJesus = new SintonizadorFM();
        //Cubro los casos extremos para ver si funciona el sintonizador
        System.out.println(radioJesus);
        radioJesus.bajarFrecuencia();
        System.out.println(radioJesus);
        //Aqui subi 1 MHz
        radioJesus.subirFrecuencia();
        radioJesus.subirFrecuencia();
        System.out.println(radioJesus);
    }
}
