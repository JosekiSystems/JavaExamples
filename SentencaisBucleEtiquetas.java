public class SentencaisBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }

                System.out.print("[i = " + i + ", j = " + j + "]");
            }

        }
        System.out.println("\n==================================");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }

                System.out.print("[i = " + i + ", j = " + j + "]");
            }

        }
        System.out.println("\n==================================");
        bucle3:
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            int j = 0;
            while (j <= 5) {
                if (i == 4 || j==4) {
                    continue bucle3;
                }

                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }

        }
        System.out.println("\n==================================");
        bucleSemHora:
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            int j = 0;
            while (j <= 8) {
                if (i == 4 || i==5 ) {
                    System.out.println("Dia = " + i + " viernes chiquito y viernes!!!");
                    continue bucleSemHora;
                }

                System.out.println(" Dia " + i +"   " + j + " = Horas  ");
                j++;
            }

        }
    }
}

