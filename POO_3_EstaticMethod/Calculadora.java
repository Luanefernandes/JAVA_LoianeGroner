package POO_3_EstaticMethod;

public class Calculadora {
	
	public static int soma (int num1, int num2) {
		return num1+num2;
	}
	
	public static int subtrair (int num1, int num2) {
		return num1-num2;
	}
	
	public static int multiplicar (int num1, int num2) {
		return num1*num2;
	}
	
	public static int dividir (int num1, int num2) {
		return num1/num2;
	}
	
	public static double potencia (int num1, int num2) {
		return Math.pow(num1, num2);
	}

}
