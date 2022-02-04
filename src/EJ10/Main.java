package EJ10;

public class Main {
    public static void main(String[] args) {
        Gato jesus = new Gato("Antonia", "Rojo","Comun",3);
        Gato espe = new Gato("Chispas", "Rojo","Comun",3);


        System.out.println(jesus.compareTo(jesus.getEdad()));
        if (jesus.compareTo(espe.getEdad()) > 0){
            System.out.println("El gato de jesus es mayor que el de espe");
        } else if (jesus.compareTo(espe.getEdad()) < 0){
            System.out.println("El gato de jesus es mas pequeño que el de espe");
        } else {
            System.out.println("El gato de jesus tiene la misma edad que el de espe");
        }

        if (jesus.compareTo(espe.getNombre()) > 0){
            System.out.println(espe);
            System.out.println(jesus);
        } else if (jesus.compareTo(espe.getNombre()) < 0){
            System.out.println(jesus);
            System.out.println(espe);
        } else {
            System.out.println(jesus);
            System.out.println(espe);
        }
    }

}
