import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;
        String curso2 = null;

        Boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo == false) {

        }


        if (esNulo){
            curso = "Programacion Java";
            curso2 = "";
        }

        boolean esVacio = curso2.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso2.isEmpty();

        if (esVacio2){
            System.out.println("esVacio2 = " + esVacio2);
            System.out.println(curso2.toUpperCase());
            System.out.println("bienvenido al curso por tercera ocacion = ".concat(curso));
        }

        System.out.println("bienvenido al curso por segunda ocacion = ".concat(curso));
        System.out.println("bienvenido al curso = " + curso);
        System.out.println(curso.toUpperCase());

        String curso3=" ";
        boolean esblanco = curso3.isBlank();
        if (esblanco == true) {
            System.out.println("esblanco = " + esblanco);
            System.out.println("bienvenido al curso por cuarta ocacion = ".concat(curso));

        }
    }
}
