import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número binario (máximo 8 cifras): ");
        int binario = sc.nextInt();

        int decimal = 0;

        while (binario > 0) {
            int cifra = binario % 10;
            decimal = decimal * 2 + cifra;
            binario = binario / 10;
        }

        System.out.println("Su valor decimal es: " + decimal);
    }
}
