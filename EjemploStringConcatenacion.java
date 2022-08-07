public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        String curso3 = "programacion java";
        String curso4 = "programacion java";

        String pregunta = "Who are you?... Im the choosen one, AKA";
        String textosuma = "Cadena de texto con dos enteros";
        String TheChoosenOne = "\n Joaquin Rodrigo Avendaño de la Selva";
        
        int numeroA = 5;
        int numeroB = 10 ; 
        
        String concatenacionUnotextDosint = textosuma + numeroA + numeroB;
        System.out.println("concatenacionUnotextDosint = " + concatenacionUnotextDosint);
        
        String concatenacionUnoteDosintPrintCordenado =textosuma + numeroA + numeroB;
        System.out.println("concatenacionUnoteDosintPrintCordenado = " + textosuma +(numeroA + numeroB));
        
        String concatenacionDosintUnotext = numeroA + numeroB + textosuma;
        System.out.println("concatenacionDosintUnotext = " + concatenacionDosintUnotext);

        
        String concatenacion = pregunta + TheChoosenOne;
        System.out.println("concatenacion  = " + concatenacion);

        String concatenacionporMetodo = pregunta.concat(TheChoosenOne);
        System.out.println("concatenacionporMetodo = " + concatenacionporMetodo);

        String concatenacionporComposiciondeMedotos = pregunta.concat("Composicion".concat(TheChoosenOne));
        System.out.println("concatenacionporComposiciondeMedotos = " + concatenacionporComposiciondeMedotos);

        String concatenacionporSucesiondeMetodos = pregunta.concat("sucession").concat(TheChoosenOne);
        System.out.println("concatenacionporSucesiondeMetodos = " + concatenacionporSucesiondeMetodos);


        //La concatenacion esta mejor definida por los metodos
        
        
        //curso4 declaracion implicita del objeto igual a objetos anteriores definidos implicitamente con el mismo contenido
        
        

        boolean esIgualObjeto = curso == curso2;
        boolean esIgualObjeto2 = curso == curso3;
        boolean esIgualObjeto3 = curso3 == curso4;
        boolean esIgualObjeto4 = curso == curso4;

        //Boolean esIgualObjeto4 compara dos objetos defindos implicitamente con distinto contenido corresponde a esIgualObjeto
        
        
        System.out.println("esIgualObjeto = " + esIgualObjeto);

        esIgualObjeto = curso.equals(curso2);
        System.out.println("esIguaContenido = " + esIgualObjeto);

        esIgualObjeto2 = curso.equals(curso3);
        System.out.println("esIgualContenido2 = " + esIgualObjeto2);

        esIgualObjeto2 = curso.equalsIgnoreCase(curso3);
        System.out.println("esIgualObjeto2OIgnoreCase = " + esIgualObjeto2);

        System.out.println("esIgualObjeto3 = " + esIgualObjeto3);
        System.out.println("esIgualObjeto4 = " + esIgualObjeto4);

        //El metodo equals para comparacion de cadenas es el que corresponde. 


    }
}
