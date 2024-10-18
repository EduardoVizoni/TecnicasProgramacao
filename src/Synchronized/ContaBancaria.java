package Synchronized;

/**
 * Classe que representa uma conta bancária simples.
 */
class ContaBancaria {
    private int saldo = 100; // Saldo inicial da conta

    /**
     * Método para depositar um valor na conta.
     *
     * @param valor O valor a ser depositado.
     */
    public void depositar(int valor) {
        int saldoAtual = saldo; // Armazena o saldo atual

        // Simulando uma pausa para representar uma operação demorada
        try {
            Thread.sleep(100); // Pausa de 100 milissegundos
        } catch (InterruptedException e) {
            e.printStackTrace(); // Trata a interrupção
        }

        saldoAtual += valor; // Atualiza o saldo
        saldo = saldoAtual; // Atualiza o saldo da conta
        System.out.println("Saldo após depósito: " + saldo); // Exibe o saldo após o depósito
    }

    /**
     * Método para obter o saldo atual da conta.
     *
     * @return O saldo atual da conta.
     */
    public int getSaldo() {
        return saldo; // Retorna o saldo da conta
    }
}