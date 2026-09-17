public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, int agencia, String titular){
        super(numero, agencia, titular);
    }

    @Override
    public void exibirInfo() {
        System.out.println();
        System.out.println("==========Informações da Conta Corrente==========");
        System.out.println("== Titular: "+this.getTitular());
        System.out.println("== Numero: "+this.getNumero());
        System.out.println("== Agência: "+this.getAgencia());
        System.out.println("== Saldo: "+this.getSaldo());
        System.out.println("== Estado da conta: "+this.isAtiva());
        System.out.println("=================================================");
    }
}
