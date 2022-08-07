
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        int precio1 = 2;
        int precio2 = 5;
        int sumadeprecios = (precio1 + precio2);
        double impuesto = 19e-2;


        System.out.println("precio1 = " + precio1);
        System.out.println("precio2 = " + precio2);
        System.out.println("sumadeprecios = " + sumadeprecios);
        System.out.println("impuesto = " + impuesto);
        System.out.println("impuestodelafactura = " + impuesto * sumadeprecios);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        //String numeroStri3 = scanner.nextLine();

        int precio3 = 0;
        try {
            precio3 = scanner.nextInt(); //Integer.parseInt(numeroStri3);
        } catch (InputMismatchException e){
            System.out.println("Tiene que ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("precio3 = " +precio3);

        String msumadeprecios = "suma de precios de " + precio3 + precio2 + precio1;
        String productodeprecios = "producto de precios " + (precio3 * precio2 * precio1);
        String impuestototal = "impuesto total de " + (precio1 * precio2 * precio3 * impuesto);

        String mensaje = msumadeprecios;
        mensaje += "\n" + productodeprecios;
        mensaje += "\n" + impuestototal;

        System.out.println("mensaje = " + mensaje);


    }





}



