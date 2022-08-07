import com.sun.jdi.BooleanValue;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogicoVerdadero = true;
        boolean metodoLogicoVerdadero = Boolean.TRUE;
        boolean objetoLogicoVerdadero = Boolean.TRUE.booleanValue() ;
        double d = 98765.43e-3; // 98.76543
        float  f = 1.2345e2f; //123.45
        boolean esIgual = 3-2 == 1;


        datoLogicoVerdadero = d > f ;


        System.out.println("datoLogicoVerdadero = " + datoLogicoVerdadero);
        System.out.println("metodoLogicoVerdadero = " + metodoLogicoVerdadero);
        System.out.println("objetoLogicoVerdadero = " + objetoLogicoVerdadero);
        System.out.println("datoLogicoVerdadero = " + datoLogicoVerdadero);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("esIgual = " + esIgual);
        


        boolean datoLogicoFalso = false;
        System.out.println("datoLogicoFalso = " + datoLogicoFalso);

        datoLogicoFalso = d < f ;
        System.out.println("datoLogicoFalso = " + datoLogicoFalso);

    }
}
