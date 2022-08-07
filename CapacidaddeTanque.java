import java.util.Scanner;

public class CapacidaddeTanque {
    public static void main(String[] args) {

        double capacidad1 = 70;
        double capacidad2 = 60;
        double capacidad3 = 40;
        double capacidad4 = 35;
        double capacidad5 = 20;
        double capacidad6 = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de litros que tiene para guardar en el tanque de 1 a 70");
        double capacidad = s.nextDouble();

        Object estado = capacidad >= capacidad1? "tanque lleno":
                capacidad >= capacidad2? "tanque casi lleno":
                capacidad >= capacidad3? "tanque a 3/4":
                capacidad >= capacidad4? "Medio tanque":
                capacidad >= capacidad5? "Suficiente" :
                capacidad >= capacidad6? "Insuficiente" : "que clase de brujeria...";


        System.out.println("capacidad = " + capacidad);
        System.out.println("estado = " + estado);

    }

}

