package Complementarios_2;
import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> listaDeEstudiantes = new ArrayList<>();

        listaDeEstudiantes.add("Adrian");
        listaDeEstudiantes.add("Balthazar");
        listaDeEstudiantes.add("Alejandro");
        listaDeEstudiantes.add("Guillermo");
        listaDeEstudiantes.add("Schipani");
        listaDeEstudiantes.add("Sebastian");
        listaDeEstudiantes.add("Javier");
        listaDeEstudiantes.add("Dario");
        listaDeEstudiantes.add("Emanuel");
        listaDeEstudiantes.add("Mauro");
        listaDeEstudiantes.add("Guido");
        listaDeEstudiantes.add("Mauro");

        List<String> primerCurso = listaDeEstudiantes.subList(0,4);
        List<String> segundoCurso = listaDeEstudiantes.subList(4,8);
        List<String> tercerCurso = listaDeEstudiantes.subList(8, listaDeEstudiantes.size());

        System.out.println("Primer curso");
        for (String estudiante : primerCurso) {
            System.out.println(estudiante);
        }
        System.out.println("\nSegundo curso");
        for (String estudiante : segundoCurso) {
            System.out.println(estudiante);
        }
        System.out.println("\nTercer curso");
        for (String estudiante : tercerCurso) {
            System.out.println(estudiante);
        }
    }
    
}
