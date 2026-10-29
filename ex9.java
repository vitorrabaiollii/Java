import java.util.Scanner;
/*
 * Usei IA generativa para me ajudar com as fórmulas de conversão
 * de milhas e de temperatura para Fahrenheit.
 * Também utilizei a IA para ajudar na elaboração dos textos do programa.
 */
public class ex9 {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Converter Celsius para Fahrenheit");
            System.out.println("2 - Converter km para milhas");
            System.out.println("3 - Classificar peso");
            System.out.println("4 - Sobre");
            System.out.println("5 - Sair");
            opcao = es.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius: ");
                    int celsius = es.nextInt();
                    double calculo_fah = 9.0 / 5.0;
                    double fah = celsius * calculo_fah + 32;
                    System.out.println(celsius + " graus Celsius = " + fah + " graus Fahrenheit");
                    break;

                case 2:
                    System.out.println("Digite a distância em km: ");
                    int km = es.nextInt();
                    double calculo_mil = 0.621371;
                    double milhas = km * calculo_mil;
                    System.out.println(km + " km = " + milhas + " milhas");
                    break;
                    
                case 3:
                    double cont = 0;
                    while (true) {
                        System.out.println("Digite o peso:");
                        System.out.println("Digite -1 para encerrar a entrada de pesos.");
                        int a = es.nextInt();

                        if (a < 50 && a > 0) {
                            System.out.println("Peso insuficiente");
                            System.out.println("________________________________________");
                            cont += a;
                        } else if (a >= 50 && a <= 100) {
                            System.out.println("Peso ideal");
                            System.out.println("________________________________________");
                            cont += a;
                        } else if (a > 100) {
                            System.out.println("Peso acima do ideal");
                            System.out.println("________________________________________");
                            cont += a;
                        } else if (a == -1) {
                            System.out.println("Programa encerrado");
                            System.out.println("Total de pesos digitados: " + cont);
                            System.out.println("________________________________________");
                            break;
                        } else {
                            System.out.println("valor inválido");
                            System.out.println("________________________________________");
                        }
                    }
                    break;

                case 4:

                    System.out.println("\nSobre o programa:");
                    System.out.println("________________________________________\n");
                    System.out.println("versão do Java: " + (System.getProperty("java.version")));
                    System.out.println("________________________________________\n");
                    System.out.println("Esse programa funciona em outros sistemas operacionais porque o Java utiliza a JVM, que executa o mesmo");
                    System.out.println("código compilado em cada sistema. Assim, basta a outra máquina ter uma \nversão compatível do Java instalada, sem precisar alterar o programa.\n");
                    System.out.println("________________________________________\n");
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }  while (opcao != 5);
    }
}


