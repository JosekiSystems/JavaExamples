import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingrese una fecha con formato 'dd/MM/yyyy' ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            
            Date fecha1 = new Date();
            System.out.println("fecha1 = " + fecha1);

            if(fecha.after(fecha1)){
                System.out.println("La fecha ingresada es posterior a la fecha actual");
            }else if(fecha.before(fecha1)){
                System.out.println("La fecha ingresda es anterior a la fecha actual");
            } else if(fecha.equals(fecha1)){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }
            if(fecha.compareTo(fecha1) > 0){
                System.out.println("La fecha ingresada es posterior a la fecha actual");
            }else if(fecha.compareTo(fecha1) < 0){
                System.out.println("La fecha ingresda es anterior a la fecha actual");
            }else if(fecha.compareTo(fecha1) == 0){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }


        }catch (ParseException e){
           /* e.printStackTrace();*/
            System.err.println("La fecha tiene un formarto incorrecto" + e.getMessage());
            System.err.println("El formato tiene la forma 'dd/MM/yyyy' ");
            /*System.exit(1);*/
            main(args);
        }
        
    }
}
