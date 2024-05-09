public class ProdutoNaoPerecivel extends Produto {
    public ProdutoNaoPerecivel(String nome, String codigo, double preco, int estoque) {
        super(nome, codigo, preco, estoque);
    }

    @Override
    public boolean isPerecivel() {
        return false;
    }

    @Override
    public String getInfoValidade() {
        return "Não perecível";
    }
}
