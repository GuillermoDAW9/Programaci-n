import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();

        int cifras = 0;

        while (numero > 0) {
            numero = numero / 10;
            cifras++;
        }

        System.out.println("El número tiene " + cifras + " cifras.");
    }
}
