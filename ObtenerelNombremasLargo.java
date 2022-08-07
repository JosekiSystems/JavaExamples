import java.util.Scanner;

public class ObtenerelNombremasLargo {
    public static void main(String[] args) {


        Object medida = "";

        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";

        double medida1 = 0.0;
        double medida2 = 0.0;
        double medida3 = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un primer nombre");
        nombre1 = s.next();

        System.out.println("Ingrese un segundo nombre");
        nombre2 = s.next();

        System.out.println("Ingrese un tercer nombre");
        nombre3 = s.next();


        medida1 = nombre1.length();
        medida2 = nombre2.length();
        medida3 = nombre3.length();


        System.out.println(" el nombre1 es  = "+ nombre1 );
        System.out.println("medida1 = " + medida1);
        System.out.println(" el nombre2 es  = "+ nombre2 );
        System.out.println("medida2 = " + medida2);
        System.out.println(" el nombre3 es  = "+ nombre3 );
        System.out.println("medida3 = " + medida3);

        medida = medida1 >= medida2? medida1 :
                medida2 >= medida3? medida2  :
                medida3 >= medida1? medida3  : medida1;

        System.out.println(" la medida del nombre mas largo es = " + medida );
    }
}
