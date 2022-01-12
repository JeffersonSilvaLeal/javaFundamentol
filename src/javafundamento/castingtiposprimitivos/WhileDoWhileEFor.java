package javafundamento.castingtiposprimitivos;

// Estrutura de Repetição
public class WhileDoWhileEFor {

	public static void main(String[] args) {
		
		System.out.println("WHILE");
		// Valor da variável
		int x = 0;
		
		// Estrutura de repetição
		while (x <= 10) {
			// Saida de dado na tela
			System.out.println(x);
			// Incremento
			x++;
		}
		
		System.out.println();
		System.out.println("WHILE + restrição");
		// Valor  da variável
		int m = 0;
		while (m < 10) {
		// Incrementa o valor de m em +1
			m++;
			
		
			if (m == 5) {
		// break para a aplicação ao m chegar em 5;
		// continuar a aplicação excluindo número 5 do loop		
				continue;
			}
			
			System.out.println(m);
		}
	System.out.println();
	System.out.println("DoWhile");
	
	int n = 0;
	
	do {
		System.out.println(n);
		n++;
	}while (n <= 15);
	
	System.out.println();	
	System.out.println("For");
	//  variável  condição    incremento
	for (int d = 0, j = 10; d <= 10; d++, j-- ) {
		System.out.println("d: " + d + "  " + "j: "+ j);
		}
	
	System.out.println();
	System.out.println("For exemplo2");
	for (int p = 0; p < 15; p++) {
		// Condição
		if(p == 5) {
			break;
		}
		System.out.println(p);
	}
	
	System.out.println();
	System.out.println("For exemplo 3");
	
	System.out.println();
	System.out.println("For exemplo2");
	for (int a = 0; a < 15; a++) {
		
		if(a == 5) {
			continue;
		}
		
		if(a == 10) {
			continue;
		}
		System.out.println(a);
	}
	}
}
