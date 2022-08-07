public class WrapperInteger {
    public static void main(String[] args) {

        int intPirmitivo = 32768;
        int intPrimitivo2 = 32767;
        int intPrimitivo3 = 127;
        
        Integer intObjeto = Integer.valueOf(intPirmitivo);
        Integer intObjeto2 = 32768;
        
        Integer intobjeto3 = Integer.valueOf(intPrimitivo2);
        Integer intObjeto4 = Integer.valueOf(intPrimitivo3);

        System.out.println("intObjeto = " + intObjeto);

        /* primitivo a referencia*/

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);
        
        /*referencia a objeto*/
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue(); /*el intobjeto supera por un byte la converion a short*/
        System.out.println("shortObjeto = " + shortObjeto);
        
        Short shortObjeto2 = intobjeto3.shortValue(); /*el intobjeto3 esta en el limite de bytes que coporta el short*/
        System.out.println("shortObjeto2 = " + shortObjeto2);

        Byte ByteObjeto = intObjeto.byteValue(); /* intObjeto supera el maximo de un byte que es 127 */
        System.out.println("ByteObjeto = " + ByteObjeto);

        Byte ByteObjeto2 = intObjeto4.byteValue(); /* intObjeto4 esta en el limite que suporta byte*/
        System.out.println("ByteObjeto2 = " + ByteObjeto2);
        
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
        
        /*para convertir un tipo de dato se tiene que tomar en cuenta el limite supererior respectivamente*/
        
        
        
        


    }
}
