public class conta implements iConta {

    @Override
    public void imprimirExtrato() {
        
    }

    private static int agencia_padrao = 0001;
    private static int sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private cliente Cliente;

    public conta(cliente cliente){
        this.agencia = conta.agencia_padrao;
        this.numero = sequencial++;
        this.Cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirComuns(){
        System.out.println(String.format("titular: %s",this.Cliente.getNome()));
        System.out.println(String.format("agencia: %d",this.agencia));
        System.out.println(this.numero);
        System.out.println(this.saldo);
    }
}

