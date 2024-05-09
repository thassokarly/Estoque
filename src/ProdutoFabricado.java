import java.time.LocalDate;

public class ProdutoFabricado extends ProdutoPerecivel {
    private LocalDate dataFabricacao;

    public ProdutoFabricado(String nome, String codigo, double preco, int estoque, LocalDate dataValidade, LocalDate dataFabricacao) {
        super(nome, codigo, preco, estoque, dataValidade);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
}

