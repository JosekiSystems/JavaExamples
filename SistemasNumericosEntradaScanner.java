
import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Entero:");
        //String numeroStri3 = scanner.nextLine();

        int numeroDecimal3 = 0;
        try {
            numeroDecimal3 = scanner.nextInt(); //Integer.parseInt(numeroStri3);
        } catch (InputMismatchException e){
            System.out.println("Tiene que ingresar un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal3 = " + numeroDecimal3);

        String resultadoBinario = "numero binario de " + numeroDecimal3 + " = " + Integer.toBinaryString(numeroDecimal3);
        String resultadoOctal = "numero octal de " + numeroDecimal3 + " = " + Integer.toOctalString(numeroDecimal3);
        String resultadoHexa = "numero hexadecimal de" + numeroDecimal3 + " = " + Integer.toHexString(numeroDecimal3);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println("mensaje = " + mensaje);

    }


}
