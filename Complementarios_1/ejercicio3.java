package Complementarios_1;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar número : ");
        int num = scan.nextInt();

        Secuencia(num);
        scan.close();
    }

    public static void Secuencia( int num) {
        if (num<=0) {
                System.out.println("Error : El numero ingresado el menor o igual a 0");
            return;
        }
    
        int aux = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= aux; j++) {
                System.out.print(j);
            }
            aux++;
            System.out.print("\n");
        }
    }
    
}
