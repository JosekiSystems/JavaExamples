public class EjemploClaseMath {
    public static void main(String[] args) {
         int valorabsoluto = Math.abs(-3);
        System.out.println("valorabsoluto de -3 = " + valorabsoluto);
        
        valorabsoluto = Math.abs(3);
        System.out.println("valorabsoluto de 3 = " + valorabsoluto);
        
        double max = Math.max(3.5, 3.4);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 3.4);
        System.out.println("min = " + min);
        
        double cotasuperior = Math.ceil(2.5);
        System.out.println("cotasuperior = " + cotasuperior);
        
        double cotainferior = Math.floor(3.5);
        System.out.println("cotainferior = " + cotainferior);
        
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        
        double log = Math.log(1);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(2, 3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(144);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);
        
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians (180.00);
        System.out.println("sin(180) = " + Math.sin(radianes));
        System.out.println("cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians (0.00);
        System.out.println("sin(0) = " + Math.sin(radianes));
        System.out.println("cos(0) = " + Math.cos(radianes));



        
    }
}
