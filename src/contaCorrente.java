public class contaCorrente extends conta {
    
    public contaCorrente(cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato(){
        System.out.println("### extrato conta corrente. ###");
        super.imprimirComuns();

    }
}
