package EJ123;

import java.util.Locale;

public class Vehiculo {
    private String matricula;
    private MarcaDeVehiculo marca;
    private TipoDeVehiculo tipo;

    //Constructor vacio
    public Vehiculo() {

    }
    //Constructor si se mete un enumerado
    public Vehiculo(String matricula, MarcaDeVehiculo marca, TipoDeVehiculo tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tipo = tipo;
    }
    //Constructor si se mete un string en vez de un enumerado
    public Vehiculo(String matricula, String marca, TipoDeVehiculo tipo) {
        this.matricula = matricula;
        this.marca = validarMarca(marca);
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public String getMarcaString(){
        return String.valueOf(marca);
    }

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }

    public void setMarcaString(String marca) {
        this.marca = validarMarca(marca);
    }

    //Validador de marca de vehiculo, en el caso de que la marca no sea valida se pondra una marca null
    private MarcaDeVehiculo validarMarca(String marca){
        MarcaDeVehiculo marcaValidada = null;
        marca = marca.toUpperCase(Locale.ROOT);
        for (MarcaDeVehiculo vehiculo: MarcaDeVehiculo.values()) {
            if (vehiculo.name().equals(marca)){
                marcaValidada = vehiculo;
            }
        }
        return marcaValidada;
    }

    public TipoDeVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeVehiculo tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Vehiculo: " +
                "Matricula: " + matricula +
                " Marca: " + marca +
                " Tipo: " + tipo;
    }

    public void compareTo(Vehiculo vehiculoB) {
        if (this.getTipo().compareTo(vehiculoB.getTipo()) > 0) {
            System.out.println(this.getTipo() + " es mas rapido que " + vehiculoB);
        } else if (this.getTipo().compareTo(vehiculoB.getTipo()) < 0) {
            System.out.println(this.getTipo() + " es mas lento que " + vehiculoB);
        } else {
            System.out.println(this.getTipo() + "es igual de rapido que " + vehiculoB);
        }

    }


}
