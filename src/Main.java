/* Definicion de Clase. Todo programa Java debe tener al menos una clase
 *  Primer programa Java
 *  Tipos de variables en Java ** no entiendo los String **
 *
 * Data Type	Size	Description
 * byte	1 byte	Stores whole numbers from -128 to 127
 * short	2 bytes	Stores whole numbers from -32,768 to 32,767
 * int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
 * boolean	1 bit	Stores true or false values
 * char	2 bytes	Stores a single character/letter or ASCII values
 */


public class Main {
    // definicion de metodo main(), debe estar en todo programa Java y se ejecutará al iniciarlo.
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Enteros.incrementarAntes();
        Enteros.incrementarDespues();
        Enteros.multiplicarG();
        Cadenas.concatenar();
        Cadenas.mayusculas();
        Cadenas.minusculas();
        Flotantes.multiplicar();
        Booleanos.getVerdadero();
        Caracter.getLetra();
        Largos.getLargo();
        Dobles.getDoble();
        //System.out.println(telefono);
    }
}


class Enteros {

    public static void incrementarAntes() {
        int numero = 10;
        System.out.println(++numero);
    }

    public static void incrementarDespues() {
        int numero = 10;
        System.out.println(numero++);
    }

    public static void multiplicarG() {
        int numero = 10;
        float g = 9.80665f;
        numero++;
        numero = numero * (int) g;
        System.out.println(numero);
    }
}


class Cadenas {

    public static void concatenar() {
        String nombre = "Juan";
        String apellido = "Moreno";
        String nombreCompleto;
        nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
    }

    public static void mayusculas() {
        String texto = "En un lugar de la Mancha \nde cuyo nombre no quiero acordarme...";
        System.out.println(texto.toUpperCase());
    }

    public static void minusculas() {
        String texto = "En un lugar de la Mancha \tde cuyo nombre no quiero acordarme...";
        System.out.println(texto.toLowerCase());
    }
}


class Flotantes {
    public static void multiplicar() {
        float importe = 150000.00f;
        float tipo = 1.5f;
        float cuota;
        cuota = (importe * tipo) / 100;
        System.out.println(cuota);
    }
}


class Booleanos {
    public static void getVerdadero() {
        boolean verdadero;
        verdadero = true;
        System.out.println(verdadero);
    }
}


class Caracter {
    public static void getLetra() {
        char letra;
        letra = 85;
        System.out.println(letra);
    }
}


class Largos {
    public static void getLargo() {
        long numeroLargo;
        numeroLargo = 150000000000L + 200000000000L;
        System.out.println(numeroLargo);
    }
}


class Dobles {
    public static void getDoble() {
        double numeroDoble;
        numeroDoble = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899 * 2;
        System.out.println(numeroDoble);
    }
}