package Synchronized;

/**
 * Classe principal para executar o exemplo com sincronização.
 */
public class ExemploComSincronizacao {
    public static void main(String[] args) {
        ContaBancariaSincronizada conta = new ContaBancariaSincronizada(); // Cria uma nova conta bancária

        // Cria a Thread 1 que deposita 50 na conta
        Thread t1 = new Thread(() -> conta.depositar(50));

        // Cria a Thread 2 que deposita 30 na conta
        Thread t2 = new Thread(() -> conta.depositar(30));

        // Inicia ambas as threads
        t1.start();
        t2.start();

        try {
            // Aguarda a conclusão da Thread 1
            t1.join();
            // Aguarda a conclusão da Thread 2
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); // Trata a interrupção
        }

        // Exibe o saldo final da conta após as operações de depósito
        // Agora o saldo deve ser corretamente 180 devido à sincronização.
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}