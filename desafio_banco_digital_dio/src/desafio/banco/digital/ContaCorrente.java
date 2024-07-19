package desafio.banco.digital;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	public void imprimirExtrato() {
		System.out.println("===Extrato contaCorrente===");
		super.imprimirInformacoesComuns();
	}
	

	
}