import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private List<Produto> produtos = new ArrayList<>();
    // métodos para adicionar/remover produtos

    public void adicionarProduto(Produto produto) {
        produtos.add(produto); // adiciona um produto para a lista de produtos do pedido
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto); // remove um produto da lista de produtos do pedido.
    }

    public double calcularTotal() { // retorna o valor total do pedido, somando os precos de todos os produtos.
        double total = 0.0;
        for(Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void finalizarPedido() {
        double total = calcularTotal();
        System.out.println("Pedido finalizado. Total: R$ " +total);
    }
}
