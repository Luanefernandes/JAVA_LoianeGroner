package POO_4_Recursividade;

public class testeCalculadora {
	
public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);

		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
