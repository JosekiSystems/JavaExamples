public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String realStrNc = "98765.43e-3";
        double realDoubleNc = Double.parseDouble(realStrNc);
        System.out.println("realDoubleNc = " + realDoubleNc);

        String logicoStr = "true";
        boolean logicoBolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBolean = " + logicoBolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        String strimasdiez = String.valueOf(otroNumeroInt+10);
        System.out.println("strimasdiez = " + strimasdiez);
        
        String striconcatenado = String.valueOf(otroNumeroStr+10);
        System.out.println("striconcatenado = " + striconcatenado);

        double otroRealDouble = 1.23456;
        String otroRealStri = Double.toString(otroRealDouble);
        System.out.println("otroRealStri = " + otroRealStri);

        double otroRealDoubleNc = 1.23456e3;
        String otroRealStriNc = Double.toString(otroRealDoubleNc);
        System.out.println("otroRealStriNc = " + otroRealStriNc);

        String otroRealStrif = String.valueOf(1.23456f);
        System.out.println("otroRealStrif = " + otroRealStrif);

        String otroRealStrifNc = String.valueOf(1.23456e4f);
        System.out.println("otroRealStrifNc = " + otroRealStrifNc);

        int i = 10000;
        short s = (short) i;
        long l = i;

        int iMv =32767 ;
        int iEv = 32768; //constante mayor que valor maximo para enteros

        short sMv = (short) iMv;
        short sEv = (short) iEv;  //short error
        
        char b = (char) i;
        
        float f = (float) i;
        
        System.out.println("l = " + l);
        System.out.println("s = " + s);
        System.out.println(Short.MAX_VALUE);
        System.out.println("sMv = " + sMv);
        System.out.println("sEv = " + sEv);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        

        


    }
}
