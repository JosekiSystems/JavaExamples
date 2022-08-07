import com.sun.source.doctree.SystemPropertyTree;

public class Caracteres {
    public static void main (String[] args){

    char caracter ='A';
    char caracterUnicode ='\u0040';
    char decimal = 64;
    char simbolo ='@';
    char espacio = ' ';
    char espacioUnicode = '\u0020';
    char retroceso = '\b';
    char tabulador = '\t';
    char nuevaLinea = '\n';

        System.out.println("caracter = "+ caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = carater: " + (decimal == caracter));
        System.out.println("decimal = caraterUnicode " + (decimal == caracterUnicode));
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = decimal " + (simbolo == decimal ) + nuevaLinea);




        System.out.println("char corresponde en byte:"+ espacio + Character.BYTES);
        System.out.println("char Unicode corresponde en byte:" + espacioUnicode + Character.BYTES);
        System.out.println("char Unicode con retroceso corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char Unicode con retroceso + retorceso corresponde en byte:" + retroceso + retroceso + Character.BYTES);
        System.out.println("char tabulador corresponde en byte:"+ tabulador + Character.BYTES);
        System.out.println("char con tabulador en la cadena corresponde en '\t'byte:" + tabulador + Character.BYTES);
        System.out.println("char nuevaLinea con caracter predefinido corresponde en byte:" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char nuevaLinea con metodo corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char nuevaLinea corresponde en byte:" + nuevaLinea + Character.BYTES + nuevaLinea);




        System.out.println("caracter corresponde en byte = " + Character.BYTES);
        System.out.println("carater corresponde en bites = " + Character.SIZE);
        System.out.println("caracter minimo = " + Character.MIN_VALUE);
        System.out.println("caracter maximo = " + Character.MAX_VALUE);



        var caracterv ='A';
        var caracterUnicodev ='\u0040';
        var decimalv = 64;
        var simbolov ='@';

        System.out.println("caracterv = " + caracter);
        System.out.println("caracterUnicodev = " + caracterUnicodev);
        System.out.println("decimalv = " + decimalv);
        System.out.println("decimalv = caraterv: " + (decimalv == caracterv));
        System.out.println("decimalv = caraterUnicodev " + (decimalv == caracterUnicodev));
        System.out.println("simbolov = " + simbolov);
        System.out.println("simbolov = decimalv " + (simbolov == decimalv));


    }

}
