import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ServicoFastFoodImpl extends UnicastRemoteObject implements ServicoFastFood {
    private Map<String, Cliente> clientes = new HashMap<>();

    public ServicoFastFoodImpl() throws RemoteException {
        super();
    }

    @Override
    public void adicionarProdutoAoCarrinho(Cliente cliente, Produto produto) throws RemoteException {

    }

    @Override
    public void adicionarProdutoDoCarrinho(Cliente cliente, Produto produto) throws RemoteException {
        cliente.getPedido().adicionarProduto(produto);
    }

    @Override
    public void removerProdutoDoCarrinho(Cliente cliente, Produto produto) throws RemoteException {
        cliente.getPedido().removerProduto(produto);
    }

    @Override
    public double calcularTotalPedido(Cliente cliente) throws RemoteException {
        return 0;
    }

    @Override
    public void finalizarPedido(Cliente cliente) throws RemoteException {

    }
}
