public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12,};
        int [] edad2 ={5,6,7};

        System.out.println("iniciamos el metodo main");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        for (int i = 0; i < edad2.length; i++){
            System.out.println("edad2[i] = " + edad2[i]);
        }

        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test2");
        test2(edad2);
        System.out.println("Despues de llamar al metodo test2");
        for (int i = 0; i < edad2.length; i++){
            System.out.println("edad2[i] = " + edad2[i]);
        }


        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");

    }
    public static void test (int [] edadArr){
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] +20;

        }
        System.out.println("Finaliza el metodo test");

    }
    public static void test2 (int [] edad2) {
        System.out.println("Iniciamos el metodo test2");
        for (int i = 0; i < edad2.length; i++) {
            edad2[i] = edad2[i] + 30;

        }
        System.out.println("Finaliza el metodo test2");
    }

}


