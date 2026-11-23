import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Ler pedido");
            System.out.println("2. Validar um código");
            System.out.println("3. Mostrar exemplos de pedidos");
            System.out.println("4. Validar lista de códigos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            if (!in.hasNextLine()) {
                return;
            }

            switch (in.nextLine().trim()) {
                case "1" -> leitorPedido();
                case "2" -> {
                    System.out.print("Digite o código: ");
                    if (!in.hasNextLine()) {
                        return;
                    }
                    String codigo = normalizarCodigo(in.nextLine());
                    if (!codigoValido(codigo)) {
                        System.out.println("Código inválido.");
                    }
                }
                case "3" -> {
                    pedidos(25, 35.6954);
                    pedidos(5232, 58.69999);
                }
                case "4" -> {
                    String[] codigos = {"ABC1234", "DEF5678", "AB12345", "XYZ12A4"};
                    Boolean[] resultados = codigoValido(codigos);
                    for (int i = 0; i < codigos.length; i++) {
                        System.out.println(codigos[i] + " | válido: " + resultados[i]);
                    }
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void leitorPedido() {
        System.out.println("\nDigite o pedido no formato codigo;peso;destino");

        String pedido = in.nextLine();
        String[] pedidoSeparado = pedido.split(";");

        while (pedidoSeparado.length != 3) {
            System.out.println("\nFormato inválido, digite novamente no formato codigo;peso;destino");
            pedido = in.nextLine();
            pedidoSeparado = pedido.split(";");
        }
        System.out.println("\n codigo " + pedidoSeparado[0]);
        System.out.println("\n peso " + pedidoSeparado[1]);
        System.out.println("\n destino " + pedidoSeparado[2]);
    }

    public static String normalizarCodigo(String codigo){
        String ajustado = codigo.trim().toUpperCase();
        return ajustado;
    }

    public static Boolean codigoValido(String ajustado) {
        while (ajustado.length() != 7){
            return false;
        }
        while (!Character.isLetter(ajustado.charAt(0)) || !Character.isLetter(ajustado.charAt(1)) || !Character.isLetter(ajustado.charAt(2)) || !Character.isDigit(ajustado.charAt(3)) || !Character.isDigit(ajustado.charAt(4)) || !Character.isDigit(ajustado.charAt(5)) || !Character.isDigit(ajustado.charAt(6))) {
            return false;
        }
        System.out.println("\nCodigo válido: " + ajustado);
        return true;
    }

    public static Boolean[] codigoValido(String[] ajustado) {
        ArrayList<Boolean> validos = new ArrayList<>();

        for (String codigo : ajustado) {
            if (!Character.isLetter(codigo.charAt(0)) || !Character.isLetter(codigo.charAt(1)) || !Character.isLetter(codigo.charAt(2)) || !Character.isDigit(codigo.charAt(3)) || !Character.isDigit(codigo.charAt(4)) || !Character.isDigit(codigo.charAt(5)) || !Character.isDigit(codigo.charAt(6)) || codigo.length() != 7) {
                validos.add(false);
            } else {
                System.out.println("\nCodigo válido: " + codigo);
                validos.add(true);
            }
        }
        return validos.toArray(new Boolean[0]);
    }

    public static void pedidos(int pedido, double peso){
        System.out.println("========NOVO PEDIDO========");
        System.out.printf("Pedidos %05d %n",pedido);
        System.out.printf("Peso %.2f kg %n%n",peso);
    }
}
