import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        Calendar calendario1 = Calendar.getInstance();

        calendario.set(2020, 0, 25, 23,20,10);
        Date fecha =calendario.getTime();

        System.out.println("fecha = " + fecha);

        calendario.set(2020, 0, 25, 25,20,10);
        Date fecha1 =calendario.getTime();

        System.out.println("fecha1 = " + fecha1);

        calendario.set(2020, Calendar.SEPTEMBER, 25,25,20,10);
        Date fecha2 =calendario.getTime();

        System.out.println("fecha2 = " + fecha2);
        
        calendario1.set(Calendar.YEAR,2022);
        calendario1.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendario1.set(Calendar.DAY_OF_MONTH, 6);
        calendario1.set(Calendar.HOUR_OF_DAY, 14);
        calendario1.set(Calendar.MINUTE, 20);
        calendario1.set(Calendar.SECOND, 10);
        
        Date fecha3 = calendario1.getTime();
        System.out.println("fecha3 = " + fecha3);

        SimpleDateFormat formato = new SimpleDateFormat("E dd/MMMM/yyyy HH:mm:ss");
        String FechaConFormato = formato.format(fecha3);
        System.out.println("FechaConFormato = " + FechaConFormato);


    }
}
