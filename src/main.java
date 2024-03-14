public class main {
    
    public static void main(String[] args) {

        cliente eu = new cliente();
        eu.setNome("eu");

        conta cc = new contaCorrente(eu);

        cc.depositar(100);
        conta cp = new contaPoupança(eu);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
