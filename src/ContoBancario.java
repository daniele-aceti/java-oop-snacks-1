/*Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente. */
public class ContoBancario {

    private int numeroConto;

    private float saldo;

    public ContoBancario(int numeroConto) {
        saldo = 0;
    }

    public float getsaldoConto() {
        return saldo;
    }

    public float deposito(float saldo) {
        this.saldo += saldo;
        return saldo;
    }

    public float prelievo(float saldo) {
        return this.saldo -= saldo;
    }

    public void saldoCorrente() {
        System.out.println(saldo);
    }
}
