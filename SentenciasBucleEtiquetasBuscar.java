public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal trtrtrtrr";
        String palabra = "tr";

        int maxp = palabra.length();
        int max = frase.length() - maxp;


        int cantidad = 0;
        int cantidad2 = 0;

        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != 't') {
                continue;
            }

            cantidad++;
        }

        System.out.println("La cantidad de veces que aparace la letra t en la frase es = " + cantidad);

        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != 'g') {
                continue;
            }
            cantidad2++;
        }
        System.out.println("La cantidad de veces que aparece la letra g en la frase es  = " + cantidad2);


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


    }
}
