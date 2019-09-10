public class Condicionales {
    public static void main(String[] args) {
        CondicionalSiEntones.consultarSi();
        CondicionalSiNo.consultarSiNo();
        CondicionalSiNo.consultarSiNoSiNo();
        CondicionalAbreviada.consultarCorta();
        Conmutador.elegirResultado();
    }
}

class CondicionalSiEntones {
    public static void consultarSi() {
        int x = 10, y = 15;
        if (y > x) {
            System.out.println("El mayor es " + y);
        }

        if (x < y) {
            System.out.println("El menor es " + x);
        }

        if (x == y) {
            System.out.println("Son iguales");
        }

        if (x != y) {
            System.out.println("No son iguales");
        }
    }
}

class CondicionalSiNo {
    public static void consultarSiNo() {
        String nombre = "Salva", nombreOld = "salva";
        if (nombre.toUpperCase() == nombreOld.toUpperCase()) {
            System.out.println("El nombre en mayúsculas es: " + nombre);
        } else {
            System.out.println("WARNING: " + nombre.toUpperCase() + " y " + nombreOld.toUpperCase() + " Los nombres no coinciden!!!");
        }
    }

    public static void consultarSiNoSiNo() {
        int x = 10, y = 15, z = 20;
        if (x > y) {
            System.out.println("X es Mayor");
        } else if (y > z) {
            System.out.println("Y es Mayor");
        } else {
            System.out.println("Z es Mayor");
        }
    }
}


class CondicionalAbreviada {
    public static void consultarCorta() {
        int x = 10, y = 15, z = 20;
        int i = (z > y) ? z : y;
        System.out.println(i);
    }
}


class Conmutador {
    public static void elegirResultado() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(("Error!!"));
        }
    }
}