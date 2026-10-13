import java.util.Scanner;

public class BarajaFrancesa {

  public static void main (String[] args) {
    int palo = (int) (Math.random() *4.0);
    int valor= (int) (Math.random() *13.0);
    Scanner sc = new Scanner (System.in);

    System.out.println(s: "El palo de la baraja es: " + palo);
    if (palo==0)
      System.out.println(x: "Picas");
    else if (palo==1)
      System.out.println(x: "Corazones");
    else if (palo==2)
      System.out.println(x: "Diamantes");
    else 
      System.out.println(x: "Treboles");
    System.out.println("El valor de la carta es: " + valor);

sc.close();
  }
