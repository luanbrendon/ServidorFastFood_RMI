import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class ServidorFastFood {

    public static void main(String[] args){
        try {
            //Este e o nome pelo qual o servico sera localizado
            String nomeServico = "controlePedido";

            //Cria o objeto a ser servido
            ServicoFastFood servico = new ServicoFastFoodImpl();

            /*Faz a associação do objeto servico com o nome nomeServico
             na URL rmi://localhost/ usando o método Naming.rebind().
             */
            Naming.rebind("rmi://localhost/" +nomeServico, servico);

            //Imprime uma mensagem informando que o servidor está no ar e o nome do serviço associado.
            System.out.println("Servidor no ar." + nomeServico);

        /*Trata exceções que podem ocorrer durante a execução do programa.
        Se uma exceção RemoteException for lançada, uma mensagem de erro será exibida.
        Se uma exceção MalformedURLException for lançada, uma exceção RuntimeException será lançada.
         */
        }catch (RemoteException re) {
            System.out.println("Excecao: " +re.getMessage());
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);

        }
    }
}
