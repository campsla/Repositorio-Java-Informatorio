package Complementarios_1;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese a que numero elevar a la potencia: ");
        int b = sc.nextInt();
        sc.close();

        int res = 1;
        for (int i = 1; i <= b ; i++) {
            res *= a;
        }

        System.out.println("El numero " + a + " a la potencia de " + b + " es: " + res);
    }
    
}
