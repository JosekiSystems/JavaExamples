public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Ingresar una operacion (suma,resta,multi,division) y dos numeros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00; 
        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                    resultado = a-b;
                    break;
            case "multi":
                resultado = a*b;
                break;
            case"division":
                if(b == 0){
                    System.out.println("La division entre cero no esta definida");
                    System.exit(-1);
                }
                resultado = (double) a/b;
                break;
            default:
                resultado = a+b;
                
        }
        System.out.println("resultado = " + resultado);
    }
}
