package javafundamento.ifswitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfSwitch {

	public static void main(String[] args) {

		/**
		 * Estrutura de tomada de decis�o If Else: Permite executar um c�dido se uma
		 * condi��o for verdadeira ou falso sempre baseada como booleano True || false
		 * 
		 */

		
		/**
		 * 			Modo de entrada de cada tipo de dado
		 * int numeroInteiro = scanner.nextInt();
		   byte numeroByte = scanner.nextByte();
           long numeroLong = scanner.nextLong();
           boolean booleano = scanner.nextBoolean();
           float numeroFloat = scanner.nextFloat();
           double numeroDouble = scanner.nextDouble();
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
			System.out.println("O valor informado n�o � um n�mero");
		}
		
	
		
		/**
		 * 
		 * Swicth permite tomar decis�o com base em uma condi��o true 
		 * S� testa igualdade
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
		
		scanner.close();
		sc.close();
	}
		
}
