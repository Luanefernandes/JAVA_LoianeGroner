package Loops_do_while_for;

import java.util.Scanner;

public class exe04 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int i;
		double totala=80000, totalb=200000, soma=0;
		
		System.out.println("vamos calcular....");
		
		while (totala<=totalb) {
			
			totala += (totalb/100) * 3;
			
			totalb += (totala/100) * 1.5;
			
			soma = soma+1;
			
		
		   } 
		
		System.out.println("O valor de A é: "+ totala+ "\nE B é: "+ totalb);
		
		System.out.println("A quantidade de anos que o país A precisa para ter a mesma quantidade de B é: " + soma +" anos");

	}

}