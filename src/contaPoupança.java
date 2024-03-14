public class contaPoupança extends conta{
    
    public contaPoupança(cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato(){
        System.out.println("### extrato conta corrente. ###");
        super.imprimirComuns();
    }
}
