package javafundamento.conceitoinicial;

// Funcionamento da passagem de parâmetros para métodos

public class PassagemParametro {
	
	int v;
	
	// Passagem de parâmetro por copia
	void trocar(int x) {
		x = 20;
	}
	
	// Copia de referencia
	void alterarValor(PassagemParametro pass) {
		pass.v = 20;
	}
	
	public static void main(String[] args) {
	
		
		PassagemParametro p = new PassagemParametro();
		
		int x = 10;// vale 10
		p.trocar(x);// vale 10
		
		System.out.println(x);// vale 10
		
		//Referencia continua sendo uma copia
		
		PassagemParametro pass = new PassagemParametro();
		pass.v = 10;// vale 10
	
		p.alterarValor(pass);// Copia o conteudo para a váriavel da class 'AlterarValor'
		
		System.out.println(pass.v);// vale 20
	}

}
