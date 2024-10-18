package Simulation;

/**
 * Classe responsável por processar o pagamento de um pedido.
 */
class ProcessarPagamento implements Runnable {
    @Override
    public void run() {
        System.out.println("Validando pagamento...");
        try {
            Thread.sleep(3000); // Simulando o tempo de validação
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pagamento validado!");
    }
}