package desafio.banco.digital;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param contas the contas to set
	 */
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	

}
