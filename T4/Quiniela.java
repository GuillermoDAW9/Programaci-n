import java.util.Random;

public class Quiniela {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        for (int i = 1; i <= 15; i++) {

            int numero = aleatorio.nextInt(13);

            if (numero < 6) {
                System.out.println("Partido " + i + ": 1");
            } else if (numero < 10) {
                System.out.println("Partido " + i + ": X");
            } else {
                System.out.println("Partido " + i + ": 2");
            }
        }
    }
}
