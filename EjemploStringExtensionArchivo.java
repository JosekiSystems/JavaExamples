public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.jpeg";

        int i = archivo.indexOf(".");
        int si= archivo.lastIndexOf(".");


        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i) = " + archivo.substring(i));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i) = " + archivo.substring(si));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(si+1));



    }
}
