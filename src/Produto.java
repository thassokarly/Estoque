public abstract class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    public Produto(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
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

    public abstract boolean isPerecivel();

    public abstract String getInfoValidade();
}
