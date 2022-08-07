import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre ="Rodrigo";


        System.out.println("nombre.lenth()" + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Rodrigo\") = " + nombre.equals("Rodrigo"));
        System.out.println("nombre.equals(\"rodrigo\") = " + nombre.equals("rodrigo"));
        System.out.println("nombre.equalsIgnoreCase(\"rodrigo\") = " + nombre.equalsIgnoreCase("rodrigo"));
        System.out.println("nombre.compareTo(\"Rodrigo\") = " + nombre.compareTo("Rodrigo"));
        System.out.println("nombre.compareTo(\"Rodriguez\") = " + nombre.compareTo("Rodriguez"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(1,5));
        System.out.println("nombre.substring(1,7) = " + nombre.substring(1,7));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\"1\") = " + trabalenguas.replace("a","1"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //muestra el numero de la primer casilla en donde aparece el caracter
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // muestra el valor de la ultima casilla en donde aparece el caracter
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); //si el caracter no pertenece a la cadena su valor es menor que cero
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t')); //ejemplo en donde la primer casilla en la que aparece el caracter corresponde a cero
        System.out.println("trabalenguas.contains(\"b\") = " + trabalenguas.contains("b"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));
        System.out.println("trabalenguas.endsWith(\"z\") = " + trabalenguas.endsWith("z"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));

        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  " .trim());
    }
}
