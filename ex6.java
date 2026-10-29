import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
            
        System.out.println("Digite o peso: ");
        int a = es.nextInt();

        if ( a < 50 && a > 0) {
            System.out.println("Peso insuficiente");
        } else if (a >= 50 && a <= 100) {
            System.out.println("Peso ideal");
        } else if (a > 100) {
            System.out.println("Peso acima do ideal");
        }else {
            System.out.println("valor inválido");
        }  
    }    
}
