import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        
        double random = Math.random();
        System.out.println("random = " + random); /* el racional que genera la funcion random esta acotado entre 0 y 1 */

        random = Math.floor(random);
        System.out.println("randomf1 = " + random);

        double random2 = Math.random()*7;
        System.out.println("random2 = " + random2);
        
        random2 = Math.floor(random2);
        System.out.println("random2f = " + random2);
        
        String[] colores = {"azul", "amarillo", "rojo", "verde", "morado", "naranja"};
        double random3 = Math.random();
        random3 *= colores.length;
        System.out.println("random3 = " + random3);
        System.out.println("colores = " + colores[(int) random3]);

        Random randomObj = new Random(); /* genera reales */
        
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        int radomIntAcotado = randomObj.nextInt(3);
        System.out.println("radomIntAcotado = " + radomIntAcotado);
        
        int radomIntAcotado2 = randomObj.nextInt(-3, 3);
        System.out.println("radomIntAcotado2 = " + radomIntAcotado2);
        
        long radomLong = randomObj.nextLong();
        System.out.println("radomLong = " + radomLong);
    }
}
