import netscape.javascript.JSObject;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        int numeroBinario = 0b111110100;
        
        int numero = 30;

        String numeroStri = JOptionPane.showInputDialog (null,"Ingrese un numero entero");

        int numeroDecimal2 = 0;
        try {
            numeroDecimal2 = Integer.parseInt(numeroStri);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Tiene que ingresar un numero");
            main(args);
            System.exit(0);
        }











        String resultadodenumeroDecimal = "numeroDecimal = " + numeroDecimal;
        System.out.println(resultadodenumeroDecimal);


        String resultadodenumero = "numero = " + numero;
        System.out.println(resultadodenumero);
        String resultadodenumeroDecimal2 = "numeroDecimal2 = " + numeroDecimal2 ;
        System.out.println(resultadodenumeroDecimal2);

        System.out.println("numero binario de numeroDecimal = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numero binario de numero = " + numero + " = " + Integer.toBinaryString(numero));
        System.out.println("numero binario de numeroDecmail2 = "+ numeroDecimal2 + Integer.toBinaryString(numeroDecimal2));

        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroBinario = " + numeroDecimal2);

        System.out.println("numero octal de numeroBinario = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        System.out.println("numero octal de numero = " + numero + " = " + Integer.toOctalString(numero) );
        System.out.println("numero octal de numeroDecimal2  = " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2));

        int numeroOctal = 0764;
        int numeroO = 036;

        String reultadodenumeroOctal = "numeroOctal = " + numeroOctal;
        System.out.println(reultadodenumeroOctal);

        String resultadodenumeroO ="numeroO = " + numeroO ;
        System.out.println(resultadodenumeroO);

        String resultadohexadecimaldenumeroDecimal ="numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadohexadecimaldenumeroDecimal);

        String resultadohexadecimaldenumeroDecimal2 = "numero hexadecimal de numeroDecimal2 = " + numeroDecimal2 + Integer.toHexString(numeroDecimal2);
        System.out.println(resultadohexadecimaldenumeroDecimal2);

        String resultadohexadecimaldenumeroO = "numero hexadecimal  de = " + numeroO + " = " + Integer.toHexString(numeroO);
        System.out.println(resultadohexadecimaldenumeroO);

        int numeroHex = 0x1f4;
        int numeroOHex = 0x1e;

        String resultadodenumeroHex = "numeroHex = " + numeroHex ;
        System.out.println(resultadodenumeroHex);

        String resultadodenumeroOHEx = "numeroOHex = " + numeroOHex ;
        System.out.println(resultadodenumeroOHEx);

        String mensaje = "\nnumero binario de numeroDecmail2 = "+ numeroDecimal2 + Integer.toBinaryString(numeroDecimal2);
        mensaje += "\nnumero octal de numeroDecimal2  = " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2);
        mensaje += "\nnumero octal de numeroDecimal2  = " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2);
        mensaje += "\nnumeroHex = " + numeroHex;
        mensaje += "\nnumeroOHex = " + numeroOHex;

        JOptionPane.showMessageDialog (null, mensaje);



        
    }


}
