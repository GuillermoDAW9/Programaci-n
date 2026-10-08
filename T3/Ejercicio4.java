import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero > 99999) {
            System.out.println("El número no es válido.");
        } else {
            int original = numero;
            int invertido = 0;

            while (numero > 0) {
                int cifra = numero % 10;
                invertido = invertido * 10 + cifra;
                numero = numero / 10;
            }

            if (original == invertido) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }

        teclado.close();
    }
}

/*int original = 171;
int n = original;
int inverso = 0;

Primer paso
inverso = inverso*10 + n % 10  => 0*10+5= 5
n = n/10                       => 175/10= 17

Segundo paso
inverso = inverso*10 + n % 10  => 5*10+7= 57
n = n/10                       => 17/10= 1

Tercer paso
inverso = inverso*10 + n %10   => 57*10+1= 571
n = n/10                       => 1/10= 0*/
