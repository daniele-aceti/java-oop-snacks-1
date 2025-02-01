public class ContoBancarioApp {
    public static void main(String[] args) {
        ContoBancario contoCorrente = new ContoBancario(1222334);
        System.out.println(contoCorrente.getsaldoConto());
        contoCorrente.setDeposito(1000);
        System.out.println(contoCorrente.getsaldoConto());
        contoCorrente.setPrelievo(150);
        System.out.println(contoCorrente.getsaldoConto());
    }
}
