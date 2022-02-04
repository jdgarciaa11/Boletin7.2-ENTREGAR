package EJ10;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compareTo(int edadOtroGato){
        int rtn = -1;
        if (this.edad > edadOtroGato){
            rtn = 1;
        }else if ( this.edad == edadOtroGato){
            rtn = 0;
        }
        return rtn;
    }

    public int compareTo(String nombreOtroGato){
        int rtn = -1;
        if (this.nombre.compareTo(nombreOtroGato) > 0 ){
            rtn = 1;
        }else if ( this.nombre.compareTo(nombreOtroGato) == 0){
            rtn = 0;
        }
        return rtn;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
}
