package POO_3_EstaticMethod;

public class EXE02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(1, 2));
		imprimirTela(Calculadora.subtrair(1, 2));
		imprimirTela(Calculadora.multiplicar(4, 2));
		imprimirTela(Calculadora.dividir(2, 3));
		imprimirTela(Calculadora.potencia(2, 2));

	}
	
	private static void imprimirTela(double d) {
	System.out.println(d);
		
	}



}
