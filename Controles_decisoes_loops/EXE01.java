package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE01 {
	
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);
		
		int a,b;
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = leia.nextInt();
		
		if (a>b) {
			
			System.out.println("O valor maior é A: "+a);
			
		}
		
		else {
			
			System.out.println("O valor maior é B: "+b);
			
		}
		
	}

}
