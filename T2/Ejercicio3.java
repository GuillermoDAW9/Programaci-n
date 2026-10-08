import java.util.Scanner;

public class ConversorMbKb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en Mb: ");
        double mb = scanner.nextDouble();

        double kb = mb * 1000;

        System.out.println(mb + " Mb = " + kb + " Kb");

        scanner.close();
    }
}
