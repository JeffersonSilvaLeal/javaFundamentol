package javafundamento.ifswitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfSwitch {

	public static void main(String[] args) {

		/**
		 * Estrutura de tomada de decisão If Else: Permite executar um códido se uma
		 * condição for verdadeira ou falso sempre baseada como booleano True || false
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
			System.out.println("O valor informado não é um número");
		}
		
	
		
		/**
		 * 
		 * Swicth permite tomar decisão com base em uma condição true 
		 * Só testa igualdade
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
		
		scanner.close();
		sc.close();
	}
		
}
