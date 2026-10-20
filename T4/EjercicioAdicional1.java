import java.util.Scanner;

public class EjercicioAdicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota, suma = 0;
        double maximo = 0, minimo = 10;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce una nota:");
            nota = teclado.nextDouble();

            System.out.println("Al alza: " + (Math.ceil(nota * 10) / 10));
            System.out.println("A la baja: " + (Math.floor(nota * 10) / 10));
            System.out.println("Truncada: " + (int) nota);

            suma = suma + nota;

            if (nota > maximo) {
                maximo = nota;
            }

            if (nota < minimo) {
                minimo = nota;
            }
        }

        System.out.println("La media es: " + (suma / 5));
        System.out.println("La nota máxima es: " + maximo);
        System.out.println("La nota mínima es: " + minimo);

        teclado.close();
    }
}
