package Complementarios_1;
import java.util.Scanner;
public class ejercicio2 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            
    System.out.println("Ingresar el primer número : ");
    int a = sc.nextInt();

    System.out.println("Ingresar el segundo número : ");
    int b = sc.nextInt();


    System.out.println(a + " + " + b + " = "+ (a+b));
    System.out.println(a + " - " + b + " = "+ (a-b));
    System.out.println(a + " * " + b + " = "+ (a*b));
    System.out.println(a + " / " + b + " = "+ (a/b));
    System.out.println(a + " % " + b + " = "+ (a%b));
    sc.close();


    }
}