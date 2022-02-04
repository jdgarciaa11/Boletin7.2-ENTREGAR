package EJ9;

public class PersonaC implements Cloneable {
    private String nombre;
    private int edad;
    private String dni;
    private PesoAlturaC pesoAltura;

    public PersonaC(String nombre, int edad, String dni, PesoAlturaC pesoAltura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.pesoAltura = pesoAltura;
    }

    public PersonaC(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.pesoAltura = new PesoAlturaC(peso, altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public PesoAlturaC getPesoAltura() {
        return pesoAltura;
    }

    public void setPesoAltura(PesoAlturaC pesoAltura) {
        this.pesoAltura = pesoAltura;
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
