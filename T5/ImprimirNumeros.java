public class NumerosPrimos {
    public static void main(String[] args) {

        for (int numero = 2; numero <= 50; numero++) {
            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero);
            }
        }

    }
}
