import com.sun.jdi.BooleanValue;

import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {

        String Saludar = "Hola Mundo desde Java";
        System.out.println(Saludar);
        System.out.println("Saludar.toUpperCase() = " + Saludar.toUpperCase());

        int numero = 9;


        Boolean valor = true;
        int numero2 = 18;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        int numero3 = 1;
        if (valor) {
            numero3 = 5;
        }
        System.out.println("numero3 = " + numero3);

        var numero4 = "15";
        String despedirse;

        despedirse = "Your gone again";

        if (numero > 10) {
            despedirse = "Your gone";
        }
        System.out.println("despedirse = " + despedirse);
    }
}
