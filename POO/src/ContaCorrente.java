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
        System.out.println("=================================================");
    }

    @Override
    public int getAgencia() {
        // TODO Auto-generated method stub
        return super.getAgencia();
    }

    @Override
    public int getNumero() {
        // TODO Auto-generated method stub
        return super.getNumero();
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public String getTitular() {
        // TODO Auto-generated method stub
        return super.getTitular();
    }

    @Override
    public void setAgencia(int agencia) {
        // TODO Auto-generated method stub
        super.setAgencia(agencia);
    }

    @Override
    public void setNumero(int numero) {
        // TODO Auto-generated method stub
        super.setNumero(numero);
    }

    @Override
    public void setSaldo(double saldo) {
        // TODO Auto-generated method stub
        super.setSaldo(saldo);
    }

    @Override
    public void setTitular(String titular) {
        // TODO Auto-generated method stub
        super.setTitular(titular);
    }
    
}
