package javafundamento.criandoclasseobjeto;

public class Pessoa {

	//Atributos
	//� Caracter�sticas da classe
	//� Representados por substantivos
	String nome;
	int numFigurinhas;
	
	//� M�todos
	// Opera��es que a classe � capaz de realizar
	//Representados por verbos
	
	// Retorno Void significa que n�o retorna nada 
	 void receber(int numFigurinhas) {
		// this refer�ncia  atributo e 'numFigurinhas' faz refer�ncia ao atributo
		 this.numFigurinhas += numFigurinhas;
	}
	 
	 // Retorno Void significa que n�o retorna nada
	 
	// Tipo de retorno/ nome do m�todo / Par�metro 
	 void dar(int numFigurinhas, Pessoa p) {
		// Perde as figurinhas que esta dando
		 this.numFigurinhas -= numFigurinhas;
		 // Pessoa recebe o n�mero de figurinhas
		// p.numFigurinha += numFigurinhas; outro modo de fazer
		 p.receber(numFigurinhas);
	 }
	 
	 public static void main(String[] args) {

			// Cria��o de objeto utilizamos o NEW ..
			Pessoa p1 = new Pessoa();
			p1.nome = "Jefferson";
			
			Pessoa p2 = new Pessoa();
			p2.nome = "Patricia";
			
			p1.receber(5);
			p1.receber(7);
			System.out.println("figurinhas atuais de P1 = Jefferson " + "numFigurinhas " + p1.numFigurinhas);
			
			// P1 = Jefferson da duas figurinhas para p2 = patricia
			System.out.println("Jefferson da 2 figurinhas para Patricia");
			p1.dar(2, p2);
		
			// Figurinhas Atuais
			System.out.println("nome: " + p1.nome + " => " + "numFigurinha: " + p1.numFigurinhas);
			System.out.println("nome: " + p2.nome + " => " + "numFigurinha: " + p2.numFigurinhas);
			
			// p2 = Patricia devolve 1 figurinha para p1 Jefferson
			System.out.println("Patricia devolve 1 figurinha para Jefferson ");
			p2.dar(1, p1);
			
			// Figurinhas Atuais
			System.out.println("nome: " + p1.nome + " => " + "numFigurinha: " + p1.numFigurinhas);
			System.out.println("nome: " + p2.nome + " => " + "numFigurinha: " + p2.numFigurinhas);

		}
}
