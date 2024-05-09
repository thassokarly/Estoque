import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private String nome;
    private String codigo;
    private BigDecimal preco;
    private int estoque;

    public Produto(String nome, String codigo, BigDecimal preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public boolean possuiEstoqueSuficiente(int quantidade) {
        return estoque >= quantidade;
    }
    public void atualizarEstoque(int quantidade) {
        if (possuiEstoqueSuficiente(quantidade)) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
