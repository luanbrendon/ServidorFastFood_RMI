import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorFastFood {

    public static void main(String[] args){
        try {
            String nomeServico = "controlePedido";

            ServicoFastFood servico = new ServicoFastFoodImpl();
            Naming.rebind("rmi://localhost/" +nomeServico, servico);
            System.out.println("Servidor no ar." + nomeServico);

        }catch (RemoteException re) {
            System.out.println("Excecao: " +re.getMessage());
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);

        }
    }
}
