package Loops_do_while_for;

import java.util.Scanner;

public class exe08 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int i=1;
		Double n, media, soma=0.0;
		
		do {
			
			System.out.println("N�mero "+ i + ": ");
			n = leia.nextDouble();
			
			soma = soma + n;
			
			media = n/i;
			
			i++;
		
		} while (i<=5);
			
			System.out.println("A soma dos n�meros �: "+ soma);
			System.out.println("A m�dia dos n�meros �: "+ media);

	}

}