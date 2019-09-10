public class Bucles {
    public static void main(String[] args) {
        Mientras.mientrasHacer();
    }
}

class Mientras {
    public static void mientrasHacer() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}