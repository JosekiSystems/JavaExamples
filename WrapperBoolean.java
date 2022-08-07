public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean onjeBolean2 = Boolean.valueOf("false");
        Boolean objeBolean3 = false;


        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("onjeBolean2 = " + onjeBolean2);
        System.out.println("objeBolean3 = " + objeBolean3);

        System.out.println("comparando dos objetos boolean: " + (objBoolean == onjeBolean2)); /* == compara el valor logico del objeto*/
        System.out.println("comparando dos objetos boolean con el metodo equals: " + (objBoolean.equals(onjeBolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean == objeBolean3));
        System.out.println("comparando dos objetos boolean: " + (onjeBolean2 == objeBolean3));
        
        boolean primBoolean2 = objBoolean.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
