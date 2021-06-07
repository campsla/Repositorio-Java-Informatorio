package Complementarios_2;
import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(12);
        num.add(18);
        num.add(3);
        num.add(1);

        System.out.print("Primera Lista ");
        System.out.println("Tamaño: " + num.size());
        for (int i : num) {
            System.out.print(" - " + i + " - ");
        }

        num.add(0, 666);
        num.add(666);
        System.out.println("");
        System.out.print("Lista final ");
        System.out.println("Tamaño: " + num.size());
        for (int i : num) {
            System.out.print(" - " + i + " - ");
        }
    }
}
