import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del cono: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura del cono: ");
        double altura = sc.nextDouble();

        double volumen = (Math.PI * radio * radio * altura) / 3;

        System.out.println("El volumen del cono es: " + volumen);

        sc.close();
    }
}
