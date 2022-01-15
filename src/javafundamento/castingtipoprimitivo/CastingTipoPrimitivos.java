package javafundamento.castingtipoprimitivo;

public class CastingTipoPrimitivos {

	public static void main(String[] args) {
	
		
		/**
		 * Casting alterar um tipo de dado
		 * 
		 * byte => int => float => long => double
		 */
		
		/*
		 * Casting implicito Quando o valor atribuito cabe dentro do tipo de dado
		 */
		
		long x = 10;
		double d = 35;
		
		System.out.println("Long: " + x);
		System.out.println("Double: " + d);
		
		/*
		 * Casting explicito Quando o valor do atributo não cabe dentro do tipo de dado
		 */
		
		float g = 40.0f;
		float f = (float)40.0;
		
		System.out.println("Float: " + g);
		System.out.println("Float: "+ f);
	}

}
