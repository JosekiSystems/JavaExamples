public class OperadoresIncrementales {
    public static void main(String[] args) {

        // pre-incremento

        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-Incremento

        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre-Decremento

        i = 5;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post- Decremento
        i = 8;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + ++j);
        System.out.println("j++ = " + j++);
        System.out.println("j = " + j);

        
    }
}
