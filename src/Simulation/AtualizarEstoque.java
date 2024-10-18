package Simulation;

/**
 * Classe responsável por atualizar o estoque após a confirmação do pedido.
 */
class AtualizarEstoque implements Runnable {
    @Override
    public void run() {
        System.out.println("Atualizando estoque...");
        try {
            Thread.sleep(2500); // Simulando o tempo de atualização de estoque
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estoque atualizado!");
    }
}