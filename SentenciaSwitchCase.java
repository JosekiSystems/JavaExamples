import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes del 0 al 3");
        int num = s.nextInt();
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String nombre = n.next();

        switch (num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el numero es uno");
                break;
            case 2:
                System.out.println("el numero es dos");
                break;
            case 3:
                System.out.println("el numero es tres");
                break;
            default:
                System.out.println("El numero que ingreso no esta entre 0 y 3");
        }
        switch (nombre){
            case "admin":
                System.out.println("bienvenido " + nombre);
                break;
            case "rodrigo":
                System.out.println("Bienvenido " + nombre);
                break;
            case "bibi":
                System.out.println("Bienvenida " + nombre);
                break;
            case "laika":
                System.out.println("Bienvenida " + nombre);
                break;
            default:
                System.out.println("El usuario " + nombre + " no esta registrado");

}
    }
}
