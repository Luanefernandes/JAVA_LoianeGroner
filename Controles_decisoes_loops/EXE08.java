package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE08 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double n1, n2, n3;
		
		System.out.println("Informe o preço do produto: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe o preço do produto: ");
		n2 = leia.nextDouble();
		
		System.out.println("Informe o preço do produto: ");
		n3 = leia.nextDouble();		
		
		if(n1 < n2 && n1 < n3) {
			System.out.println("É mais rentável você comprar o de R$"+n1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("É mais rentável você comprar o de R$"+n2);
		} else if(n3 < n1 && n3 < n2){
			System.out.println("É mais rentável você comprar o de R$"+n3);
		}
		
	}
	

}