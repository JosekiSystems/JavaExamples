import java.util.Scanner;

public class Tarea12AreadeunCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número real para substituirlo como el radio de una circunferencia y calcular el area de la misma");


        double radio = scanner.nextDouble();
        System.out.println("radio = " + radio);
        
        double radioalcuadrado = Math.pow(radio, 2);
        System.out.println("radioalcuadrado = " + radioalcuadrado);
        
        double areadelacircuanferencia = radioalcuadrado*(Math.PI);
        System.out.println("areadelacircuanferencia = " + areadelacircuanferencia);

    }

}
