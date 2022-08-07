public class EjemploStringInmutable {
    public static void main(String[] args) {

        String pregunta = "Who are you?...";
        String respuesta = "Im the choosen one AKA  Joaquin Rodrigo Avendaño de la Selva";
        
        pregunta.concat(respuesta);
        System.out.println("pregunta = " +pregunta);

        String preguntaYrespuesta= pregunta.concat(respuesta);
        System.out.println("preguntaYrespuesta = " + preguntaYrespuesta);

        pregunta.transform (p -> {return p + "people say " + respuesta;});
        System.out.println("respuesta con transform = " + respuesta);

        String preguntaYrespuesta2=pregunta.transform (p -> {return p + "people say" + respuesta;});
        System.out.println("preguntaYrespuesta2 = " + preguntaYrespuesta2);

        String preguntaYrespuesta3= respuesta.replace("o", "O");
        System.out.println("preguntaYrespuesta3 = " + preguntaYrespuesta3);


    }
}
