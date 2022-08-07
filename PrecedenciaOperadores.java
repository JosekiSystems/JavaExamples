public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k )/ 3;
        System.out.println("promedio = " + promedio);

        double promedioe1 = i + j + k / 3d * 10;
        System.out.println("promedioe1 = " + promedioe1);
        double promedioe2 = i + j + k / (3d * 10);
        System.out.println("promedioe2 = " + promedioe2);
        double promedioe3 = (i + j + k) / (3d * 10);
        System.out.println("promedioe3 = " + promedioe3);
        double promedioe4 = (i + j + k) / 3d * 10;
        System.out.println("promedioe4 = " + promedioe4);

        double promedioi1d1 = ++i + j-- + k / 3d * 10;// el post incremeto o decremento se producen para {xn_+1} 0 {xn_1} respectivamente.
        System.out.println("promedioi1d1 = " + promedioi1d1);
        System.out.println("i = " + i);
        System.out.println("j = " + j); // Imprime el post decremeto ya que no pertenece a una sucession.

        double promediod1i1 = --i + j++ + k / 3d * 10;
        System.out.println("promediod1i1 = " + promediod1i1);
        System.out.println("i = " + i);
        System.out.println("promediod1i1 = " + promediod1i1);


    }
}
