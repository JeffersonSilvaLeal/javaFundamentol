package javafundamento.passagemparametro;

public class Valor {

	int v;
	
	// Passagem de parâmetro por copia
		void trocar(int x) {
			x = 20;
		}
	
	// Copia de referencia		
	void alterarValor(Valor valor) {
		valor.v = 20;
	}
}
