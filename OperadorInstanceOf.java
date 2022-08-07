

public class OperadorInstanceOf {
    public static void main(String[] args) {

       /* String text = new String("Creando un objeto de la clase String... Quiubo"); */

        String text = "Creando un objeto de la clase String... Quiubo"; //de forma literal
        Integer num = 7;
        Double decimal = 3.33;

        boolean b1 = text instanceof String;
        System.out.println("text es del tipo String = " + b1);
        b1 = text instanceof Object;
        System.out.println("text es del tipo Object = " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b2);

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b2);


        boolean b3 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b3);

        b3 = decimal instanceof  Object;
        System.out.println("decimal es del tipo Object = " + b3);


    }
}
