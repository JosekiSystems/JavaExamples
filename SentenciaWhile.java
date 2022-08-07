public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        int j = 0;
        boolean prueba = true;

        while(prueba) {

            if (j == 7) {
                prueba = false;
            }
            System.out.println("j = " + j);
            j++;
        }

        boolean prueba1 = false;
        do{
            System.out.println("se ejecuta al menos una vez");
        }while (prueba1);

        boolean prueba2 = true;
        int k = 0;
    do {
        if (k == 10) {
        prueba2 = false;
    }
        System.out.println("k = " + k);
        k++;
    }while (prueba2);

    }
}
