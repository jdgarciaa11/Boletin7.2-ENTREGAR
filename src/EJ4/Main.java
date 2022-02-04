package EJ4;

public class Main {
    public static void main(String[] args) {
        //Cambia la longitud en el constructor para ver que si pones 10 "Espe" no se añade
        Texto textoJesus = new Texto(11);
        //He puesto tantos println para mostrar la vuelta de cada metodo
        //OJO-> podria hacer perfectamente los metodos de la clase texto void pero
        //como en un futuro daremos MVC no estaria correcto lanzar mensajes desde la clase
        System.out.println(textoJesus.aniadirCadenaFinal("Hola"));
        System.out.println(textoJesus.toString());
        System.out.println(textoJesus.aniadirCaracterInicio('¡'));
        System.out.println(textoJesus.toString());
        System.out.println(textoJesus.aniadirCadenaFinal(" Espe"));
        System.out.println(textoJesus);
        System.out.println(textoJesus.aniadirCaracterFinal('!'));
        System.out.println(textoJesus);
        System.out.println("Vocales encontradas: " + textoJesus.contarVocales());
    }
}
