public class SentenciaForEach {
    public static void main(String[] args){

        int[] numeros ={1,3,5,7,9,11};
        for(int num : numeros){
            System.out.println("num = " + num);
        }
        String [] nombres  = {"Rod","Bibi","Laika","Ulises","Aura","Alan","Beth","Tom"};
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
