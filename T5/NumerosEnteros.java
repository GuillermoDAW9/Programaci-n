import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 1;
        int suma = 0;

        while (numero != 0) {
            System.out.println("Introduce un número (0 para terminar):");
            numero = teclado.nextInt();
            suma = suma + numero;
        }

        System.out.println("La suma final es: " + suma);

        teclado.close();
    }
}
