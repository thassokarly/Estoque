import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDate data;
    private List<VendaItems> itens;

    public Venda(LocalDate data) {
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.possuiEstoqueSuficiente(quantidade)) {
            itens.add(new VendaItems(produto, quantidade));
            produto.atualizarEstoque(quantidade);
        } else {
            System.out.println("Estoque insuficiente para adicionar este item à venda.");
        }
    }
}
