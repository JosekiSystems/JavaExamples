public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if(promedio >= 6.5){
            System.out.println("Felicidades, excelente promedio");

        }else if(promedio >= 5.5){
            System.out.println("Muy buen promedio" );
        }else if(promedio >= 5.0) {
            System.out.println("buen promedio");
        }else if(promedio >= 4.5){
            System.out.println("suficiente");
        }else if(promedio >= 4.0){
            System.out.println("Insuficiente");
        }else {
            System.out.println("reprobado");
        }
        System.out.println("promedio = " + promedio);
    }
}
