public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        Boolean b1 = i==j; // Operador relacional en ==; i es uigual a j
        System.out.println("b1 = " + b1);

        Boolean b2 = !b1; // ! es la negacion del resulado logico
        System.out.println("b2 = " + b2);

        Boolean b3 = i != j; // i es distinto de j, tambien se usa el operador relacion <>
        System.out.println("b3 = " + b3);
        
        Boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        Boolean b5 = m != true;
        System.out.println("b5 = " + b5);
        
        Boolean b6 = i > j;
        System.out.println("b6 = " + b6);
        
        Boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        Boolean b8 = l >= k;
        System.out.println("b8 = " + b8);
        
        Boolean b9 = l <= k;
        System.out.println("b9 = " + b9);
    }
}
