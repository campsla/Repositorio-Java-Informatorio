package Complementarios_2;
import java.util.HashMap;
import java.util.HashSet;

public class ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleadoHashSet = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleadoHashSet.add(new Empleado("Empleado 01", 31309000, 5, 1000));
        empleadoHashSet.add(new Empleado("Empleado 02", 31309001, 6, 1000));
        empleadoHashSet.add(new Empleado("Empleado 03", 31309002, 7, 1000));
        empleadoHashSet.add(new Empleado("Empleado 04", 31309003, 8, 1000));

        for (Empleado e : empleadoHashSet) {
            sueldo.put(e.getDni(), e.getSueldo());
        }

        sueldo.forEach((dni, salario) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + salario));
    }
}

class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float sueldoPorHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float sueldoPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSueldo() {
        return this.horasTrabajadas * this.sueldoPorHora;
    }

}
