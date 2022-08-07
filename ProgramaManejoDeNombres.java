import java.util.Locale;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {




        String nombre1 = "rodrigo";
        String nombre1M = nombre1.toUpperCase();

        String nombre2 = "raul";
        String nombre2M = nombre2.toUpperCase();

        String nombre3 = "ulises";
        String nombre3M = nombre3.toUpperCase();

        String dot = ".";


        System.out.println("\n nombre1 = " + nombre1);
        System.out.println("nombre1.length = " + nombre1.length());
        System.out.println("nombre1.toUpperCase = " + nombre1.toUpperCase());
        System.out.println("nombre1.charAt(0) = " + nombre1.charAt(0));
        System.out.println("nombre1M = " + nombre1M);
        System.out.println("nombre1MC.charAt(1) = " + nombre1M.charAt(1));
        System.out.println(" = " + nombre1M.charAt(1) + dot);
        System.out.println("Programa para Nombre 1 = " + nombre1M.charAt(1) + dot + nombre1M.charAt(5) + nombre1M.charAt(6));
        System.out.println("Programa para Nombre 1_1 = " + nombre1M.charAt(1) + dot + nombre1.charAt(5) + nombre1.charAt(6));

        System.out.println("\n nombre2 = " + nombre2);
        System.out.println("nombre2.length = " + nombre2.length());
        System.out.println("nombre2.toUpperCase = " + nombre2.toUpperCase());
        System.out.println("nombre2.chartAt(0) = " + nombre2.charAt(0));
        System.out.println("nombre2M =" + nombre2M);
        System.out.println("nombre2M.charAt(1) = " + nombre2M.charAt(1));
        System.out.println("Programa para Nombre 2 =" + nombre2M.charAt(1) + dot + nombre2M.charAt(2) + nombre2M.charAt(3));
        System.out.println("Programa para Nombre 2_1 =" + nombre2M.charAt(1) + dot + nombre2.charAt(2) + nombre2.charAt(3));


        System.out.println("\n nombre3 = " + nombre3);
        System.out.println("nombre3.length = " + nombre3.length());
        System.out.println("nombre3.toUpperCase() = " + nombre3.toUpperCase());
        System.out.println("nombre3.nombre3.charAt(0) = " + nombre3.charAt(0));
        System.out.println("nombre3M = " + nombre3M);
        System.out.println("nombre3M.charAt(1) = " + nombre3M.charAt(1));
        System.out.println("Programa para nombre 3 = " + nombre3M.charAt(1)+ dot + nombre3M.charAt(4) + nombre3M.charAt(5));
        System.out.println("Programa para nombre 3 = " + nombre3M.charAt(1)+ dot + nombre3.charAt(4) + nombre3.charAt(5));


    }
}
