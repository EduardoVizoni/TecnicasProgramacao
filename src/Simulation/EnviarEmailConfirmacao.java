package Simulation;

/**
 * Classe responsável por enviar um e-mail de confirmação do pedido.
 */
class EnviarEmailConfirmacao implements Runnable {
    @Override
    public void run() {
        System.out.println("Enviando e-mail de confirmação...");
        try {
            Thread.sleep(2000); // Simulando o tempo de envio do e-mail
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("E-mail de confirmação enviado!");
    }
}