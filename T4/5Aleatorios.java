import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        String palabra = "";

        for (int i = 0; i < 5; i++) {
            char letra = (char) (r.nextInt(26) + 'A');
            palabra = palabra + letra;
        }

        System.out.println(palabra);
        System.out.println(palabra.toLowerCase());
    }
}
