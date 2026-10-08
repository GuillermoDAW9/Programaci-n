import java.util.Scanner;

public class AsignaturaPrimeraHora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = teclado.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Primera hora: Programación");
                break;
            case "martes":
                System.out.println("Primera hora: Base de Datos");
                break;
            case "miercoles":
                System.out.println("Primera hora: Entornos");
                break;
            case "jueves":
                System.out.println("Primera hora: Sistemas");
                break;
            case "viernes":
                System.out.println("Primera hora: Lenguaje de Marcas");
                break;
            default:
                System.out.println("El día introducido no es válido.");
        }

        teclado.close();
    }
}
