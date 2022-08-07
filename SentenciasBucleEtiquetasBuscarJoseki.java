import java.util.Scanner;

public class SentenciasBucleEtiquetasBuscarJoseki {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
        String frase = f.nextLine();

        Scanner p = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = p.nextLine();

        /* Scanner l = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = l.nextLine(); */


        int maxp = palabra.length();
        int max = frase.length() - maxp;


        int cantidad = 0;


        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != 'l') {
                continue;
            }

            cantidad++;
        }

        System.out.println("La cantidad de veces que aparace la letra l en la frase es = " + cantidad);

       /* int cantidad2 = 0;

       for (int i = 0; i < max; i++) {
            int k = i;

            for (int j = 0 ; j < maxp; j++)
                if (frase.charAt(k++) != letra) {
                    continue buscar;
                }
            cantidad2++;
        }
        System.out.println("La cantidad de veces que aparece la letra "+ letra + " en la frase es  = " + cantidad2); */



        int cantidad3 = 0;
        buscar:

        for (int i = 0; i < max; i++) {
            int k = i;

            for (int j = 0 ; j < maxp; j++)
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            cantidad3++;
        }
        System.out.println("La palabra " + palabra + " fue encontrada  = " + cantidad3 + " veces");

        /*
        buscarr:

        for (int i = 0; i < max; i++) {
            int k = i;
            for (int j = 0 ; j < maxp; j++)
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscarr;
                }
            cantidad2++;
        }
        System.out.println("La letra " + letra + " fue encontrada  = " + cantidad2 + " veces");*/


    }
}
