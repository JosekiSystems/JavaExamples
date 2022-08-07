

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

       /* String text = new String("Creando un objeto de la clase String... Quiubo"); */

        Object text = "Creando un objeto de la clase String atravez del padre de todas las clases Object... Quiubo"; //de forma literal
        Number num = 7; // tambien se pude expresar al primitivo con un metodo en este caso Number = Integer,valueOf(7); o Number = Integer,valueOf("7");
        Number decimal = 3.33;

        boolean b1 = text instanceof String;
        System.out.println("text es del tipo String = " + b1);
        b1 = text instanceof Object;
        System.out.println("text es del tipo Object = " + b1);
        b1 = text instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b2);

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b2);
        b2 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b2);
        b2 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b2);


        boolean b3 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b3);
        
        b3 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b3);


    }
}
