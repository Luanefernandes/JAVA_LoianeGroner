package Loops_do_while_for;

import java.util.Scanner;

public class exe05 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		double totala, totalb, soma=0, i1, i2;
		
		System.out.println("Informe o valor da popula��o do pa�s A: ");
		totala = leia.nextDouble();
		
		System.out.println("Informe a taxa de crescimento do pa�s A: ");
		i1 = leia.nextDouble();
		
		System.out.println("Informe o valor da popula��o do pa�s B: ");
		totalb = leia.nextDouble();
		
		System.out.println("Informe a taxa de crescimento do pa�s B: ");
		i2 = leia.nextDouble();
			
		System.out.println("vamos calcular....");
		
		while (totala<=totalb) {
			
			totala += totalb * i1;
			
			totalb += totala * i2;
			
			soma = soma+1;
			
		
		   } 
		
		System.out.println("O valor de A �: "+ totala+ "\nE B �: "+ totalb);
		
		System.out.println("A quantidade de anos que o pa�s A precisa para ter a mesma quantidade de B �: " + soma +" anos");

	}

}