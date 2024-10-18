package Simulation;

/**
 * Classe principal para executar o processamento do pedido.
 */
public class ProcessamentoPedido {
    public static void main(String[] args) {
        System.out.println("Iniciando processamento do pedido...");

        // Cria as threads para cada tarefa do processamento do pedido
        Thread threadPagamento = new Thread(new ProcessarPagamento());
        Thread threadEmail = new Thread(new EnviarEmailConfirmacao());
        Thread threadEstoque = new Thread(new AtualizarEstoque());
        Thread threadFatura = new Thread(new GerarFatura());
        Thread threadEntrega = new Thread(new RegistrarEntrega());

        // Inicia todas as threads ao mesmo tempo
        threadPagamento.start();
        threadEmail.start();
        threadEstoque.start();
        threadFatura.start();
        threadEntrega.start();

        // Espera todas as threads terminarem
        try {
            threadPagamento.join();
            threadEmail.join();
            threadEstoque.join();
            threadFatura.join();
            threadEntrega.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pedido processado com sucesso!");
    }
}