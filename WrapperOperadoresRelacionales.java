public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        /*tando num1 y num2 son objetos de la clase Integer que en particular tambien son enteros*/

        System.out.println("Son el mismo objeto? " +(num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " +(num1 == num2));
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tiene el mismo valor entero? " + (num1.intValue() == num2.intValue()));

        Integer num3 = 127;
        Integer num4 = 127;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("Son el mismmo objeto? " + (num3 == num4)); /*java primero compara el valor entero del objeto pero lo hace hasta 127 solo para ==*/
        num4 = 128;
        System.out.println("Son el mismmo objeto? " + (num3 == num4));
        
        boolean condicion = num1 > num2;

        System.out.println("condicion = " + condicion);

        boolean condicion1 = num1 == num2;
        System.out.println("condicion1 = " + condicion1);

        boolean condicion2 = num1.intValue() > num3.intValue();
        System.out.println("condicion2 = " + condicion2);

        boolean condicion3 = num1 > num3;
        System.out.println("condicion3 = " + condicion3);
        Integer num5= 128;
        boolean condiion5 = num4 == num5;
        System.out.println("condiion5 = " + condiion5);

        /* los relacionales aritmeticos usan implictamente el valor entero del objeto*/





        


    }
}

