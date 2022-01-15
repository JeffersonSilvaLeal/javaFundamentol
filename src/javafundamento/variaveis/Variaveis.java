package javafundamento.variaveis;

// Váriaveis são aréas de memória que voçê pode armazenar informações
public class Variaveis {

	public static void main(String[] args) {
		
		/**
		 * Tipo de váriaveis
		 * 
		 */
		
	//  Tipo   Identificador  Valor
		boolean tipoBoolean = true;
		byte tipoByte = 17;
		short tipoShort = 327;
		char tipoChar = 'C';
		int tipoInt = 10;
		float tipoFloat = 1.6f;
		long tipoLong = 65807L;
		double tipoDouble = 2.59;

		/**
		 *  A partir do Java 10 é possível declarar uma 
			variável como var
		    O tipo que a variável vai assumir vai 
			depender do valor colocado nela
		 */
   //  Tipo   Identificador  Valor
		var tipoBoolean2 = true;
		var tipoByte2= 17;
		var tipoShort2 = 10;
		var tipoChar2= 10;
		var tipoInt2 = 10;
		var tipoFloat2 = 10;	
		var tipoLong2 = 10;
		var tipoDouble2 = 10;
	
		/**
		 * Valores possíveis
		 * 
		 */
		
		System.out.println("Valores possíveis");
		System.out.println("TipoBoolean: " + tipoBoolean);
		System.out.println("TipoByte: " + tipoByte + " minValor: " + Byte.MIN_VALUE + " maxvalor: " + Byte.MAX_VALUE);
		System.out.println("TipoShort: " + tipoShort + " minValor: " + Short.MIN_VALUE + " maxvalor: " + Short.MAX_VALUE);
		System.out.println("TipoChar: " + tipoChar);
		System.out.println("TipoInt: " + tipoInt + " minValor: " + Integer.MIN_VALUE + " maxvalor: " + Integer.MAX_VALUE);
		System.out.println("TipoFloat: " + tipoFloat + " minValor: " + + Float.MIN_VALUE + " maxvalor: " + Float.MAX_VALUE);
		System.out.println("TipoLong: " + tipoLong + " minValor: " + Long.MIN_VALUE + " maxvalor: " + Long.MAX_VALUE);
		System.out.println("TipoDouble: " + tipoDouble + " minValor: " + Double.MIN_VALUE + " maxvalor: " + Double.MAX_VALUE);

		
		/**
		 * Valores VAR
		 * 
		 */
		System.out.println("");
		System.out.println("Valores Var");
		System.out.println("TipoBoolean: " + tipoBoolean2);
		System.out.println("TipoByte: " + tipoByte2 + " minValor: " + Byte.MIN_VALUE + " maxvalor: " + Byte.MAX_VALUE);
		System.out.println("TipoShort: " + tipoShort2 + " minValor: " + Short.MIN_VALUE + " maxvalor: " + Short.MAX_VALUE);
		System.out.println("TipoChar: " + tipoChar2);
		System.out.println("TipoInt: " + tipoInt2 + " minValor: " + Integer.MIN_VALUE + " maxvalor: " + Integer.MAX_VALUE);
		System.out.println("TipoFloat: " + tipoFloat2 + " minValor: " + + Float.MIN_VALUE + " maxvalor: " + Float.MAX_VALUE);
		System.out.println("TipoLong: " + tipoLong2 + " minValor: " + Long.MIN_VALUE + " maxvalor: " + Long.MAX_VALUE);
		System.out.println("TipoDouble: " + tipoDouble2 + " minValor: " + Double.MIN_VALUE + " maxvalor: " + Double.MAX_VALUE);
	}
}