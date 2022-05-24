import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String op = ExibeMenu();
        while(!op.equals("5")){
            int n1 = ReceberOperando();
            int n2 = ReceberOperando();
            int resultado = Calculador(op, n1, n2);
            System.out.println("Resultado: " + resultado);
            op = ExibeMenu();
        }
    }

    public static String ExibeMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        return scan.nextLine();
    }

    public static int ReceberOperando(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um operando");
        String n1String = scan.nextLine();
        return Integer.parseInt(n1String);
    }

    public static int Calculador(String op, int n1, int n2){
        int result = 0;

        switch (op){
            case "1":
                result =  n1 + n2;
                break;
            case "2":
                result =  n1 - n2;
                break;
            case "3":
                result =  n1 * n2;
                break;
            case "4":
                result =  n1 / n2;
                break;
            default:
                System.out.println("Entre com uma opção valida");
                break;
        }
        return result;
    }
}
