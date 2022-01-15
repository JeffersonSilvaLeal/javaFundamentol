package javafundamento.sobrecargademetodo;

public class SobrecargaDeMetodos {

	// método com 2 parêmetros
	int somar (int x , int y) {
		System.out.println("Versão do método: int x , int y");
		return x + y;
	}
	
	// SobreCarga de método significa vc definir outro método com nome igual más variando o parâmetro ou o tipo de retorno
	// método com 3 parêmetros
	int somar(int x, int y, int m) {
		System.out.println("Versão do método: int x, int y, int m");
		return x + y + m;
	}
	
	// método com 2 parêmetros double
	double somar(double x, double y) {
		System.out.println("Versão do método: double x, double y");
		return x + y;
	}
	
	public static void main(String[] args) {

		// objeto criado
		SobrecargaDeMetodos s = new SobrecargaDeMetodos();
		// Método somar chamado com 2 parâmetro int
		int soma = s.somar(5, 4);
		System.out.println(soma);
		
		// Método somar chamado com  2 parâmetro double
		double soma2 = s.somar(10.2, 20.1);
		System.out.println(soma2);
	}

}
