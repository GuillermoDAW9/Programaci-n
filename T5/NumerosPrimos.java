import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número mayor que 1: ");
        int numero = teclado.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        if (primo == true) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
}
