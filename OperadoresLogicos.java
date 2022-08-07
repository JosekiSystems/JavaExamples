public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        int i1 = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // Operadores lgicos And = && y Or = ||

        Boolean b1 = i==j && k > l ;
        System.out.println("b1 = " + b1);

        Boolean b11 = i==i1 && k < l ;
        System.out.println("b1_1 = " + b11);

        Boolean b12 = i==i1 && k < l && m == true;
        System.out.println("b12 = " + b12);

        Boolean b13 = i==i1 && k < l && m == false;
        System.out.println("b13 = " + b13);

        Boolean b2 = i==j ||  k > l ;
        System.out.println("b2 = " + b2);

        Boolean b21 = i==i1 ||  k > l ;
        System.out.println("b21 = " + b21);

        Boolean b3 = i==j &&  k < l || m == false ;
        System.out.println("b3 = " + b3);

        Boolean b31 = i==j  && (k < l || m == false) ;
        System.out.println("b31 = " + b31);

        Boolean b32 = (i==j &&  k > l) || m == false ;
        System.out.println("b32 = " + b32);

        Boolean b33 = (i==i1 &&  k > l) || m == true ;
        System.out.println("b33 = " + b33);

        Boolean b34 = (i==i1 &&  k > l) || m == false ;
        System.out.println("b34 = " + b34);

        Boolean b35 = (i==i1 &&  k > l) || m == true ;
        System.out.println("b35 = " + b35);

        Boolean b36 = i==j  && (k > l || m == false) ;
        System.out.println("b36 = " + b36);

        Boolean b37 = i==i1  && (k > l || m == false) ;
        System.out.println("b37 = " + b37);

        Boolean b4 = i == i1 || k < l && m== true; // Por prioridad operacional la operacion inicia con &&
        System.out.println("b4 = " + b4);

        Boolean b5 = true || true && false ;
        System.out.println("b5 = " + b5);

        Boolean b51 = false ||  false && false ;
        System.out.println("b51 = " + b51);

        Boolean b52 = true || true && true ;
        System.out.println("b52 = " + b52);

        Boolean b53 = false || false && false ;
        System.out.println("b53 = " + b53);















    }
}
