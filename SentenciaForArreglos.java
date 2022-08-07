import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String [] nombres  = {"Rod","Bibi","Laika","Ulises","Aura","Alan","Beth","Tom"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("beth") ||
                    nombres[i].equalsIgnoreCase("tom") ||
            nombres[i].contains("Alan") ||
            nombres[i].toLowerCase().contains("Ulises".toLowerCase()))
            {
                continue;
            }
            System.out.println(i + "-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre por ejemplo \"Rod\" o \"Bibi\" : ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int j = 0; j < count; j++ ){
            if(nombres[j].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[j]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null,  "el nombre ingresado " + buscar + " no esta registrado");
        }
    }
}
