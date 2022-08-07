import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i= 3, j=5, suma = i + j, resta = i - j,multiplicacion = i * j, divicion = i / j, resto1 = i % j;
        float divicionf = i / j, divicionfp = (float) i / j, divicionfpO = (float) i / (float) j, resto2 = i % j;


        System.out.println("suma operador logico = " + suma);
        System.out.println("i + j concatenacion  = " + i + j);
        System.out.println(i + j + " i + j  ");
        System.out.println("(i+j)= " + (i + j));
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("divicion = " + divicion + " regresa cero ya que no resuelve racionales");
        System.out.println("divicionf = " + divicionf + " El dato float contiene racionales y la funcion tiene que estar bien definida ");
        System.out.println("divicionfp = " + divicionfp + " deficinicion correcta para variable racional sin expancion decimal");
        System.out.println("divicionfpO = " + divicionfpO);
        System.out.println("resto1 = " + resto1);
        System.out.println("resto2 = " + resto2);


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para decirle si es par o impar"));
        if ( numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }
        else{
            System.out.println("numero impar = " + numero);
        }
        // Computo de resulado limitado por la condicion del tipo de dato, para este caso entero

        




    }
}
