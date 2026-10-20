import java.util.Scanner;

public class EjercicioAdicional3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        String apellido1;
        String apellido2;

        System.out.println("Introduce tu nombre:");
        nombre = teclado.nextLine();

        System.out.println("Introduce tu primer apellido:");
        apellido1 = teclado.nextLine();

        System.out.println("Introduce tu segundo apellido:");
        apellido2 = teclado.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Segundo apellido: " + apellido2);

        teclado.close();
    }
}
