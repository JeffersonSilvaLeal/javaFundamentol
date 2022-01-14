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
 
// Estrutura de Tomada de Decisão IfElse || SWITCH
public class IfSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/**
		 * Estrutura de tomada de decisão If Else: Permite executar um códido se uma
		 * condição for verdadeira ou falso sempre baseada como booleano True || false
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
		System.out.println(" Digite um número inteiro");

		// recebe o número e entra na condição
		int num = scanner.nextInt();  

		// try garante que um número será digitado, se não estoura uma exceção
		try {
			if (num > 10) {
				System.out.println("O número é maior que 10");

			} else if (num < 10) {
				System.out.println("O número não é maior que 10");

			} else {
				System.out.println("O número é 10");
			}
			// Exceção do Scanner caso não seja digitado um número
		} catch (InputMismatchException e) {
			System.out.println("Não é um número: " + num);
		}

		/**
		 * 
		 * Swicth permite tomar decisão com base em uma condição true Só testa igualdade
		 */

		// Entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número Entre 1 e 3");

		// recebe o número e entra na condição
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
		
		// Requisição de dados
		Scanner sc1 = new Scanner(System.in);
		
		// Pergunta
		System.out.println("Escolha uma opção entre 1 e 2: ");
		
		// Conversão de scanner para variável
		int x = sc1.nextInt();
		
		switch (x) {
		// Break está por debaixo dos panos
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
		default -> throw new IllegalStateException("Dia inválido: " + dia);
		};
		System.out.println(numeroEscolhido);

		// Swich Expression possibilita ultilizar o valor da expressão anterior
		
		int i = switch (dia) {
		case SEGUNDA -> 1;
		case TERCA -> 2;
		default -> 0;
		};
		
		System.out.println("Dia escolhido: "+ i);
	
	
		
		
	}
	

}
