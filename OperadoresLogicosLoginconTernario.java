import java.util.Scanner;

public class OperadoresLogicosLoginconTernario {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Lerod";
        passwords[0] =  "12345";
        usernames[1] = "Lablache";
        passwords[1] = "12345";
        usernames[2] = "Laika";
        passwords[2] =  "123"; */

        String[] usernames = {"Lerod", "Lablance", "Laika"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next(); // u de usuario

        System.out.println("Ingrese el password");

        String p = scanner.next(); // p de password

        Boolean esAutenticado = false;

        for(int i=0; i < usernames.length; i++){
            esAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) )? true : esAutenticado;

           /* if( usernames[i].equals(u) && passwords[i].equals(p) ) {
                esAutenticado = true;
                break;
            } */
        }
        String mensaje = esAutenticado? "Bienvenido ".concat(u).concat(" san") : "Ususario o conrtraseña incorrectos \n Lo sentimos usted requiere La blache";
        System.out.println("mensaje = " + mensaje);
         /* if(esAutenticado) {
            System.out.println("Bienvenido ".concat(u).concat(" san"));
        }else{
            System.out.println("Ususario o conrtraseña incorrectos");
            System.out.println("Lo sentimos usted requiere La blache");
        } */
    }
}

