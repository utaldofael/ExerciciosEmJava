public class Conta {
    private int numero;
    private int agencia;
    private String titular;
    private double saldo;
    private boolean ativa;
    
    public Conta(int numero, int agencia, String titular){
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 500;
        this.ativa = true;
        System.out.println("Conta ativa com sucesso! Conta possue R$"+this.saldo+" no momento.");
      }

    public void exibirInfo(){
        System.out.println();
        System.out.println("==========Informações da Conta==========");
        System.out.println("== Titular: "+this.titular);
        System.out.println("== Numero: "+this.numero);
        System.out.println("== Agência: "+this.agencia);
        System.out.println("== Saldo: "+this.saldo);
        System.out.println("== Estado da conta: "+this.ativa);
        System.out.println("========================================");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == this.titular){
            System.out.println("Error - Defina um nome diferente.");
        } else {
            this.titular = titular;
        }
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
