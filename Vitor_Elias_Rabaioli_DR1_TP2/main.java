public class main {
    public static void main(String[] args) {
        System.out.println("-----NOVO PEDIDO-----");

        Pedido vitor = new Pedido("ABC2345", 25.5, new Endereco("Rua das Araucárias", "Boa Vista do Sul"));
        vitor.impressao();

        Pedido leti = new Pedido();
        leti.setCodigo("ACD0987");
        leti.setPeso(250.30);
        leti.setDestino(new Endereco("Rua das Flores", "Farroupilha"));
        leti.setPrioridade(Prioridade.URGENTE);
        leti.impressao();

        Pedido pedido1 = new Pedido("DEF1234", 12.5, new Endereco("Rua dos Andradas", "Porto Alegre"));
        pedido1.setPrioridade(Prioridade.URGENTE);
        pedido1.impressao();

        Pedido pedido3 = new Pedido("JKL9012", 42.0, new Endereco("Rua das Videiras", "Bento Gonçalves"));
        pedido3.setPrioridade(Prioridade.LEVE);
        pedido3.impressao();
        pedido3.setPeso(-50);
        System.out.println("Peso original: " + pedido3.getPeso());

        DespachoPedido despacho = new DespachoPedido(pedido3.getCodigo(), pedido3.getPrioridade());
        System.out.println(despacho);
        System.out.println("Total de pedidos criados: " + Pedido.getTotalCriados());
    }
}
