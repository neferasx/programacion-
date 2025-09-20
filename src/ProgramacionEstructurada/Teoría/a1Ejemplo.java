package ProgramacionEstructurada.Teoría;

public class a1Ejemplo {

	public static void main(String[] args) {
		
		double numeroEntero,numeroEntero3; // Declaro dos variables de tipo int, separado por coma
		byte numeroPequeño; // Numeros chiquitos -128 a 127 = 8 bits
		long numeroGrande; // Numeros grandes  -2^63 a 2^63-1 = 64 bits
		float numeroReal1; 
		double numeroReal2; // Pa decimales 
		char caracter,letra;
		boolean estadoActivo;
		boolean estadoCerrado;

			numeroEntero=7;	
			numeroReal2=6.78;
			numeroEntero3=2;
			numeroPequeño=3;
			numeroGrande=9876548;
			numeroReal1=9.9f;
			caracter='?';
			letra='a';
			estadoActivo = true;
			estadoCerrado = false;
			
			System.out.println("El valor es \"" + numeroEntero);
			
		int numeroEntero1=5;
		double numeroEntero2=2;
		
		double resultado=numeroEntero1/numeroEntero2;
			System.out.println(resultado);
		
		double resultado2=numeroEntero1%numeroEntero2;
		System.out.println(resultado2);
		
		caracter='A';
		numeroEntero=caracter;
		caracter=(char)numeroEntero; 
		
		System.out.println(caracter);
		System.out.println((char)numeroEntero);
		numeroEntero = (int) Math.pow(2, 3); 
		
		
	    double numeroReal = 7.6;
		numeroEntero=(int)numeroReal;
		System.out.println(numeroEntero);
		

		
			

	}

}
