import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoFastFood extends Remote {
    void adicionarProdutoAoCarrinho(Cliente cliente, Produto produto) throws RemoteException;

    void adicionarProdutoDoCarrinho(Cliente cliente, Produto produto) throws RemoteException;

    void removerProdutoDoCarrinho(Cliente cliente, Produto produto) throws RemoteException;
    double calcularTotalPedido(Cliente cliente) throws RemoteException;
    void finalizarPedido(Cliente cliente) throws RemoteException;
}
