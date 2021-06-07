package Complementarios_1;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        sc.close();
        char a;

        for (int i = 0; i < texto.length(); i++) {
            a = texto.charAt(i);
            if (a >= 97 && a <= 122) {
                a -= 32;
            }
            System.out.print(a);
        }
    }
    
}
