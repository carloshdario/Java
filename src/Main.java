
public class Main {

	public static void main(String[] args) {
	
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");
		
		Conta cc = new ContaCorrente(carlos);
		Conta poupanca = new ContaPoupanca(carlos);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		cc.sacar(200);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
