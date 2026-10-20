import java.util.Scanner;

public class EjercicioAdicional2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numero;
        boolean correcto = true;

        System.out.println("Introduce un número de 2 a 7 dígitos:");
        numero = teclado.nextLine();

        if (numero.length() < 2 || numero.length() > 7) {
            correcto = false;
        }

        if (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) < '0' || numero.charAt(i) > '9') {
                correcto = false;
            }
        }

        if (correcto) {
            System.out.println("El número es correcto.");
        } else {
            System.out.println("El número no es correcto.");
        }

        teclado.close();
    }
}
