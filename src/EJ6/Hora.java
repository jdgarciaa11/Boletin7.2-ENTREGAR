package EJ6;

import java.time.LocalDateTime;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora (){
        this.hora = LocalDateTime.now().getHour();
        this.minutos = LocalDateTime.now().getMinute();
        this.segundos = LocalDateTime.now().getSecond();
    }

    public String getDate(){
        return LocalDateTime.now().getDayOfMonth() + " de " + LocalDateTime.now().getMonth() + " del " + LocalDateTime.now().getYear();
    }

    public void horaSegundo(int segundos){
        //Muestro primero la hora actual con todos sus segundos
        System.out.println(this.hora+":"+this.minutos+":"+this.segundos);
        for(int i = 0; i < segundos; i++){
            //Cuando inicio el bucle, hago que segundo se sume 1
            this.segundos += 1;
            //Como hago primero la suma de los segundo, veo que segundos llega a 60
            //por eso, hago un if com
            if (this.segundos==60){
                this.segundos = 0;
                this.minutos +=1;
            }
            //Pasa igual que en el caso de los segundos, cuando minuto llega a 60
            //este se iguala a 0 y a hora se le suma una mas
            if (this.minutos == 60){
                this.minutos = 0;
                this.hora += 1;
            }
            if (this.hora == 24){
                this.hora = 0;
            }
            //Aqui muestro la hora en cada iteracion
            System.out.println(this.hora+":"+this.minutos+":"+this.segundos);
        }
    }

}
