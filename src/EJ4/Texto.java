package EJ4;

public class Texto {
    private int longitudMaxima;
    private String texto = "";

    public Texto(int longitud) {
        this.longitudMaxima = longitud;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public boolean aniadirCaracterInicio(char c) {
        boolean completado = false;
        if (texto.length() + 1 <= longitudMaxima) {
            texto = c + texto;
            completado = true;
        }
        return completado;
    }

    public boolean aniadirCaracterFinal(char c) {
        boolean completado = false;
        if (texto.length() + 1 <= longitudMaxima) {
            texto = texto + c;
            completado = true;
        }
        return completado;
    }

    public boolean aniadirCadenaInicio(String cadena) {
        boolean completado = false;
        if (texto.length() + cadena.length() <= longitudMaxima) {
            texto = cadena + texto;
            completado = true;
        }
        return completado;
    }

    public boolean aniadirCadenaFinal(String cadena) {
        boolean completado = false;
        if (texto.length() + cadena.length() <= longitudMaxima) {
            texto = texto + cadena;
            completado = true;
        }
        return completado;
    }

    public int contarVocales() {
        int vocales = 0;
        for (int x = 0; x < this.texto.length(); x++) {
            char letraActual = this.texto.charAt(x);
            if (esVocal(letraActual)) {
                vocales++;
            }
        }
        return vocales;
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
