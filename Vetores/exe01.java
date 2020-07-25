package Vetores;

import java.util.Scanner;

public class exe01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [5];
		int[] vetorb = new int [vetora.length];
		
		for (int i=0;i<vetora.length;i++) {
			System.out.println("Informe o valor do vetor " + i + ": ");
			vetora[i] = leia.nextInt();
			
			vetorb[i]=vetora[i];
			
		}
		
		System.out.println("Vetor A: ");
	
		for (int i=0;i<vetora.length;i++) {
			System.out.print(vetora[i] + " ");
			
		}
		
		System.out.println("\nVetor B: ");
		
		for (int i=0;i<vetora.length;i++) {
			System.out.print(vetorb[i] + " ");
			
		}
	}

}
