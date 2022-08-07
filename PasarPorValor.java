public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("iniciamos el metodo main con i  = " + i);
        test(i);
        test1(i);
        System.out.println("Finaliza el metodo main con i  = " + i); // se mantiene igual ya que int, Integer son inmutable//

    }

    public static void test (int i){
        System.out.println("Iniciamos el metodo test con i = " + i);

        i = 35;
        System.out.println("Finaliza el metodo test con el nuevo valor entero de i = " + i);
    }
    public static void test1 (int i){
        System.out.println("Iniciamos el metodo test1 con i = " + i);

        i = 37;
        System.out.println("Finaliza el metodo test1 con el nuevo valor entero de i = " + i);
    }
}

