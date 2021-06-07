package Complementarios_1;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int b = sc.nextInt();
        sc.close();

        int res = 0;
        for (int i = 0; i < b; i++) {
            res += a;
        }

        System.out.println("El resultado es: " + res);
    }
    
}
