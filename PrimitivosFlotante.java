public class PrimitivosFlotante {
    //Flotate con valor inicial por default
    static float varFlotante;
    //Flotate con valor inicial igual a pi
    static float varFlotante2 = 3.1416f;

    public static void main (String[] args){
// Expresión de número real con expanción decimal en notación cientifica para números reales.
        float realFloat = 1.0E-2f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde a byte = " + Float.BYTES);
        System.out.println("float corresponde a bite = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float  = " + Float.MIN_VALUE);

        double realDoble =1.1234567890987654321;
        System.out.println("realDoble = " + realDoble);
        System.out.println("doble  corresponde a byte = " + Double.BYTES);
        System.out.println("doble corresponde a bite = " + Double.SIZE);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double  = " + Double.MIN_VALUE);

        // float varFlotante
        System.out.println("varFlotante = " + varFlotante);
        System.out.println("varFlotante2 = " + varFlotante2);

        // flotante Double por default
        var varFlontante3 = 3.14167;
        System.out.println("varFlontante3 = " + varFlontante3);


    }
}
