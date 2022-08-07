public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++ ){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j=0; j < l; j++ ){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        int n = archivoArr.length;
        for (int k=0; k<n; k++){
            System.out.println("archivoArr = " + archivoArr[k]);
        }
        System.out.println("extension = " + archivoArr[n-1]);
    }
}
