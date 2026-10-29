import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        double cont = 0;
        while (true) {
            
            System.out.println("Digite o peso: ");
            int a = es.nextInt();

            if ( a < 50 && a > 0) {
                System.out.println("Peso insuficiente");
                cont += a;
            } else if (a >= 50 && a <= 100) {
                System.out.println("Peso ideal");
                cont += a;
            } else if (a > 100) {
                System.out.println("Peso acima do ideal");
                cont += a;
            } else if( a == -1) {
                System.out.println("Programa encerrado");
                System.out.println("Total de pesos digitados: " + cont);
                break;
            }else {
                System.out.println("valor inválido");
            }
        }   
    }    
}
