import java.io.IOException;

public class EjemploEjecutarProgramaenSistemaOperativo {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {

            if (System.getProperty("os.name").startsWith("Windows")) {
                proceso  = rt.exec("notepad");

            } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                proceso = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux")) {
                proceso = rt.exec("gedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();


        }catch(Exception e){
                System.err.println("El comando es desconocido: " + e.getMessage());
                System.exit(1);
        }
        System.out.println("Editor closed");
        System.exit(0);
    }
}
