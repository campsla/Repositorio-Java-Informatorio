package Complementarios_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        List <Integer> horas_trab = new ArrayList <Integer> ();
        List <Integer> valor_hora = new ArrayList <Integer> ();
        List <Integer> totales = new ArrayList <Integer> ();

        int totalPagar = 0;
 
        Integer [ ] h = {6,7,8,4,5};
        horas_trab= Arrays.asList(h);

        Integer [ ] v = {350, 345, 550, 600, 320};
        valor_hora= Arrays.asList(v);

        for (int i = 0; i < h.length; i++) {
            totales.add(horas_trab.get(i)*valor_hora.get(i));
        }
       
        for (Integer p : totales) {
            totalPagar+=p;
        }
 
        System.out.println("Totales por dia : "+ totales);
        System.out.println("Total : "+ totalPagar);
    }
}
