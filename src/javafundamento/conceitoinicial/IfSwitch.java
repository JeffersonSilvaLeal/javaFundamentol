package javafundamento.conceitoinicial;

import java.util.InputMismatchException;
import java.util.Scanner;

 enum  Dia{
	
	SEGUNDA,
	TERCA,
	QUARTA,
	QUINTA,
	SEXTA,
	SABADO,
	DOMINGO
}
 
// Estrutura de Tomada de Decis�o IfElse || SWITCH
public class IfSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/**
		 * Estrutura de tomada de decis�o If Else: Permite executar um c�dido se uma
		 * condi��o for verdadeira ou falso sempre baseada como booleano True || false
		 * 
		 */

		/**
		 * Modo de entrada de cada tipo de dado int numeroInteiro = scanner.nextInt();
		 * byte numeroByte = scanner.nextByte(); long numeroLong = scanner.nextLong();
		 * boolean booleano = scanner.nextBoolean(); float numeroFloat =
		 * scanner.nextFloat(); double numeroDouble = scanner.nextDouble();
		 * 
		 * 
		 */
		// Entrada de dados
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Digite um n�mero inteiro");

		// recebe o n�mero e entra na condi��o
		int num = scanner.nextInt();  

		// try garante que um n�mero ser� digitado, se n�o estoura uma exce��o
		try {
			if (num > 10) {
				System.out.println("O n�mero � maior que 10");

			} else if (num < 10) {
				System.out.println("O n�mero n�o � maior que 10");

			} else {
				System.out.println("O n�mero � 10");
			}
			// Exce��o do Scanner caso n�o seja digitado um n�mero
		} catch (InputMismatchException e) {
			System.out.println("N�o � um n�mero: " + num);
		}

		/**
		 * 
		 * Swicth permite tomar decis�o com base em uma condi��o true S� testa igualdade
		 */

		// Entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero Entre 1 e 3");

		// recebe o n�mero e entra na condi��o
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Ganhou um CARRO");
			break;
		case 2:
			System.out.println("Ganhou  um SMARTPHONE");
			break;
		case 3:
			System.out.println("Ganhou 1000 REAIS");
		default:
			System.out.println("Perdeo TUDO");
			break;
		}

		/**
		 * 
		 * Swtich expression
		 * Disponivel apartir do java 13
		 */
		
		// Requisi��o de dados
		Scanner sc1 = new Scanner(System.in);
		
		// Pergunta
		System.out.println("Escolha uma op��o entre 1 e 2: ");
		
		// Convers�o de scanner para vari�vel
		int x = sc1.nextInt();
		
		switch (x) {
		// Break est� por debaixo dos panos
		case 1 -> System.out.println("Escolheu 1");
		case 2 -> System.out.println("Escolheu 2");
		default -> System.out.println("Escolha nula");
		}

		// Fechamento do Scanner
		scanner.close();
		sc.close();
		sc1.close();

		int numeroEscolhido = 0;
		Dia dia = Dia.SEGUNDA;
		switch (dia) {
		case SEGUNDA, TERCA, QUARTA -> numeroEscolhido = 6;
		case QUINTA -> numeroEscolhido = 7;
		case SEXTA, SABADO -> numeroEscolhido = 8;
		case DOMINGO -> numeroEscolhido = 9;
		default -> throw new IllegalStateException("Dia inv�lido: " + dia);
		};
		System.out.println(numeroEscolhido);

		// Swich Expression possibilita ultilizar o valor da express�o anterior
		
		int i = switch (dia) {
		case SEGUNDA -> 1;
		case TERCA -> 2;
		default -> 0;
		};
		
		System.out.println("Dia escolhido: "+ i);
	
	
		
		
	}
	

}
