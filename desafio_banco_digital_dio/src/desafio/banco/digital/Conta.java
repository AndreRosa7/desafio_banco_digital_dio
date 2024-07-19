package desafio.banco.digital;

public abstract class Conta implements IConta {
    
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;       
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
       this.cliente = cliente;
    }
    
    public Conta(int numero2, int agencia2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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
    
    public void imprimirInformacoesComuns() {
    	System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
    
    
}
