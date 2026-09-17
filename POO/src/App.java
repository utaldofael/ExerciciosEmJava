public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1234, 5555, "Raphael");
        c1.exibirInfo();
        c1.setTitular("Raphael");

        ContaCorrente cc1 = new ContaCorrente(4321, 6666, "Juninho");
        cc1.exibirInfo();
    }
}
