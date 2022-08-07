public class SentenciaFor {
    public static void main(String[] args) {

        int j = 0;
        int k = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("i1 = " + i1);
        }
        for (int i2 = 1; i2 <= 5; i2++) {
            System.out.println("i2 = " + i2);
        }
        for (; j <= 5; j++) {
            System.out.println("j = " + j);
        }
        for (int i4 = 10; i4 >= 0; i4--){
            System.out.println("i4 = " + i4);
        }
        for (int i5 = 1, j2 = 10; i5 < j2; i5++, j2-- ){
            System.out.println("i5 ="+ i5 + "-" +"j2 =" + j2);
        }
        for (int i6 = 0; i6 <= 10; i6++){
            if(i6 % 2 == 0 ){
                continue;
            }
            System.out.println("i6 = " + i6);
        }
        for (int i7 = 0; i7 <= 10; i7++){
            if(!(i7 % 2 == 0) ){
                continue;
            }
            System.out.println("i7 = " + i7);
        }
        
        for (;;){
            k++;
            if(k > 5)
            break;
            System.out.println("k = " + k);
        }

        System.out.println("jf = " + j);
    }

    
}

