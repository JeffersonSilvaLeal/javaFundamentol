package javafundamento.sobrecargademetodo;

public class SobrecargaDeMetodos {

	// m�todo com 2 par�metros
	int somar (int x , int y) {
		System.out.println("Vers�o do m�todo: int x , int y");
		return x + y;
	}
	
	// SobreCarga de m�todo significa vc definir outro m�todo com nome igual m�s variando o par�metro ou o tipo de retorno
	// m�todo com 3 par�metros
	int somar(int x, int y, int m) {
		System.out.println("Vers�o do m�todo: int x, int y, int m");
		return x + y + m;
	}
	
	// m�todo com 2 par�metros double
	double somar(double x, double y) {
		System.out.println("Vers�o do m�todo: double x, double y");
		return x + y;
	}
	
	public static void main(String[] args) {

		// objeto criado
		SobrecargaDeMetodos s = new SobrecargaDeMetodos();
		// M�todo somar chamado com 2 par�metro int
		int soma = s.somar(5, 4);
		System.out.println(soma);
		
		// M�todo somar chamado com  2 par�metro double
		double soma2 = s.somar(10.2, 20.1);
		System.out.println(soma2);
	}

}
