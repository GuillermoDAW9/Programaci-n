import java.util.Scanner;

public class CuadradoNumerico {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
