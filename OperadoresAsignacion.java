public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;      // El operador de asignacion en este caso es el igual.
        int j = i + 4; // Tambien el operdor de asignacion es el igual.

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;        // El operador += es igual a i = i + 2
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);
        
        j -=4; // Operador de Asignacion compuesto para la resta es igual a  j = j -4
        System.out.println("j = " + j);

        j *=3; // Operador de asignacion compuesto para la multiplicacion igual a j= j * 3
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre ='Andres'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);




    }
}
