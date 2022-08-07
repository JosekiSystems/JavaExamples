class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return nombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona  persona = new Persona();
        persona.modificarNombre("Rodrigo");
        System.out.println("iniciamos el metodo main");
        System.out.println("persona.nombre = " + persona.leerNombre());


        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finaliza el metodo main con los datos de la persona modificados");

    }
    public static void test (Persona persona){
        System.out.println("Iniciamos el metodo test");
       persona.modificarNombre("RoRo");
        System.out.println("Finaliza el metodo test");

    }

}





