package javafundamento.passagemparametro;

public class Valor {

	int v;
	
	// Passagem de par�metro por copia
		void trocar(int x) {
			x = 20;
		}
	
	// Copia de referencia		
	void alterarValor(Valor valor) {
		valor.v = 20;
	}
}
