package javafundamento.modificadorpubliceprivate;

public class Aplica��o {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria();
		
		c.setNumconta(52685);
		c.setAtiva(true); 
		c.setSaldo(5000);
		
		double saldo = c.getSaldo();
		
		System.out.println(c);
		System.out.println(saldo);
	}

}
