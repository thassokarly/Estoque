import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, String codigo, double preco, int estoque, LocalDate dataValidade) {
        super(nome, codigo, preco, estoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean isPerecivel() {
        return true;
    }

    @Override
    public String getInfoValidade() {
        return "Válido até: " + dataValidade;
    }
}

