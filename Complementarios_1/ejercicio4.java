package Complementarios_1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        int factorial = 1;
        sc.close();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + number + " es: " + factorial);
    }
}
