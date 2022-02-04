package EJ6;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hora relojEspe = new Hora();
        Scanner scan = new Scanner(System.in);
        int segundos = 0;
        System.out.println(relojEspe.getDate());
        do {
            System.out.println("Introduce segundos: ");
            try {
                segundos = scan.nextInt();
            } catch (Exception e){
                System.out.println("Valor introducido no valido");
                scan.nextLine();
            }
            //Aqui en vez de usar un boolean para validar la salida, uso la variable segundos
            //para que una vez que el valor sea mayor y no igual a 0, salga del bucle
        } while (segundos<=0);
        
        relojEspe.horaSegundo(segundos);


    }
}
