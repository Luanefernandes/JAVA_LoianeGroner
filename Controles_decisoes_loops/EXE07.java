package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE07 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double n1, n2, n3;
		
		System.out.println("Informe o valor de N1: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe o valor de N2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Informe o valor de N3: ");
		n3 = leia.nextDouble();		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O valor maior �: "+n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O valor maior �: "+n2);
		} else if(n3 > n1 && n3 > n2){
			System.out.println("O valor maior �: "+n3);
		}
		
		if(n1 < n2 && n1 < n3) {
			System.out.println("O valor menor �: "+n1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("O valor menor �: "+n2);
		} else if(n3 < n1 && n3 < n2){
			System.out.println("O valor menor �: "+n3);
		}
		
	}
	

}