import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Pedido {
    private static int totalCriados;
    private String codigo;
    private double peso;
    private Endereco destino;
    private LocalDateTime dataCriacao;
    private Prioridade prioridade;


    public Pedido(){
        destino = new Endereco("Rua não informada", "Cidade não informada");
        dataCriacao = LocalDateTime.now();
        this.prioridade = Prioridade.PADRAO;
        totalCriados++;
    }   

    public Pedido(String codigo, double peso, Endereco destino){
        this();
        setCodigo(codigo);
        setPeso(peso);
        setDestino(destino);
    }

    public void impressao(){
        System.out.println(getCodigo() + " | " + getPeso() + " | " + getDestino() + " | " + getDataCriacao() + " | " + getPrioridade());
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }else{
            System.err.println("ERRO: VALOR NEGATIVO DIGITADO PARA PESO");
            System.err.println("VALOR ORIGINAL PRESERVADO");
        }
    }
    public void setDestino(Endereco destino){
        this.destino = destino;
    }
    
    public void setPrioridade(Prioridade prioridade){
        this.prioridade = prioridade;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public double getPeso() {
        return this.peso;
    }
    public Endereco getDestino (){
        return this.destino;
    }

    public static int getTotalCriados() {
        return totalCriados;
    }
    public String getDataCriacao(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataCriacao.format(formatter);
    }
    public Prioridade getPrioridade() {
        return this.prioridade;
    }
}

