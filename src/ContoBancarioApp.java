
public class ContoBancarioApp {

    public static void main(String[] args) {
        ContoBancario contoCorrente = new ContoBancario(1222334);
        contoCorrente.saldoCorrente();
        contoCorrente.deposito(1000);
        contoCorrente.saldoCorrente();
        contoCorrente.prelievo(150);
        contoCorrente.saldoCorrente();
        contoCorrente.deposito(500);
        contoCorrente.saldoCorrente();
    }
}
