package Simulation;

/**
 * Classe responsável por gerar a fatura do pedido.
 */
class GerarFatura implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerando fatura...");
        try {
            Thread.sleep(1500); // Simulando o tempo de geração da fatura
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fatura gerada!");
    }
}