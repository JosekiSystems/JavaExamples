public class Primitivos {
    public static void main (String [] args){

        byte numeroByte = 3;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo de byte corresponde a byte a " + Byte.BYTES);
        System.out.println("tipo de byte corresponde a bite a " + Byte.SIZE);
        System.out.println("valor maximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte = " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo de short corresponde a byte = " + Short.BYTES);
        System.out.println("tipo de short corresponde a bite = " + Short.SIZE);
        System.out.println("valor maximo de un short = " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short  = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo de un entero corresponde a byte = " + Integer.BYTES);
        System.out.println("tipo de un entero corresponde a bite = " + Integer.SIZE);
        System.out.println("valor maximo de un entero = " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un entero  = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo de un long corresponde a byte = " + Long.BYTES);
        System.out.println("tipo de un long corresponde a bite = " + Long.SIZE);
        System.out.println("valor maximo de un long = " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long  = " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808F ;
        System.out.println("numeroVar = " + numeroVar);

    }
}

