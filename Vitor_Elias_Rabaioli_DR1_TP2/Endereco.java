public class Endereco {
    private final String rua;
    private final String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String toString() {
        return rua + ", " + cidade;
    }
}
