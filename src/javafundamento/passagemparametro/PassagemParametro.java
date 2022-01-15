package javafundamento.passagemparametro;

// Funcionamento da passagem de parâmetros para métodos

public class PassagemParametro {
	
	public static void main(String[] args) {
	
		
		Valor v = new Valor();
		
		int x = 10;// vale 10
		v.trocar(x);// vale 10
		
		System.out.println(x);// vale 10
		
		//Referencia continua sendo uma copia
		Valor pass = new Valor();
		pass.v = 10;// vale 10
	
		v.alterarValor(pass);// Copia o conteudo para a váriavel da class 'AlterarValor'
		
		System.out.println(pass.v);// vale 20
	}

}
