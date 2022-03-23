package javafundamento.modificadorpubliceprivate;

// Modificador publico = usado em m�todos para poder manipular atribuos da classe
// Modificador private = restringe a manipula��o de atributos por m�todos
public class ContaBancaria {

	private int numconta;
	private boolean ativa;
	private double saldo;

	
	// M�todo
	public void sacar(double valor) {
		if (valor < 0) {
			return;
		}
		
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			return;
		}
		
		saldo += valor;
	}

	// Getter = Retorno de valor
	// setter = Seta um Valor
	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		if (numconta > 0) {
			this.numconta = numconta;
		}

	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numconta=" + numconta + ", ativa=" + ativa + ", saldo=" + saldo + "]";
	}

	
	
}
