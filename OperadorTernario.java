import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "Son iguales" : "No son iguales";
        System.out.println("variable = " + variable);
        String variable2 = 7 == 5 ? "Son iguales" : "No son iguales";
        System.out.println("variable2 = " + variable2);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double musica = 0.0;
        double computacion = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la calificacion para matematicas entre 2.0 y 7.0");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la calificacion para musica entre 2.0 y 7.0");
        musica = s.nextDouble();

        System.out.println("Ingrese la calificacion para computacion entre 2.0 y 7.0");
        computacion = s.nextDouble();


        promedio = (matematicas + musica + computacion) /3;


        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado"; // El ternario simplifica el IF, ELSE
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);

    }
}
