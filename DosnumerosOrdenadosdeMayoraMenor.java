import java.util.Scanner;

public class DosnumerosOrdenadosdeMayoraMenor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = s.nextInt();

        System.out.println("Ingrese un numero");
        int num2 = s.nextInt();

        max = (num1 > num2)? num1 : num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("max = " + max);


    }

}
