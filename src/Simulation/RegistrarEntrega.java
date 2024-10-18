package Simulation;

/**
 * Classe responsável por registrar a entrega do pedido.
 */
class RegistrarEntrega implements Runnable {
    @Override
    public void run() {
        System.out.println("Registrando entrega...");
        try {
            Thread.sleep(1000); // Simulando o tempo de registro da entrega
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Entrega registrada!");
    }
}