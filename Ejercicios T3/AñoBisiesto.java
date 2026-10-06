import java.util.Scanner;

public class AñoBisiesto{
  public static void main{String[] args){
    Scanner sc = new Scanner(System.in);

    int año;

    System.out.print(s:"Introduce un año: ");
    año = sc.nextInt();

    if(año % 400 == 0)
      System.out.println("El año " + año + " es bisiesto.");
    else if (año % 100 == 0)
      System.out.println("El año " + año + " No es Bisiesto.");
    else if (año % 4 == 0)
      System.out.println("El año " + año + " es Bisiesto.");
    else
      System.out.println("El año " + año + " No es Bisiesto.");
    sc.close();
  }
                         }
