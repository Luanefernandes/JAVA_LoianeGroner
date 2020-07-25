package Vetores;
import java.util.Scanner;

public class exe05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [10];
		int[] vetorb = new int [vetora.length];
		
		int i;
		
		for(i=0; i<vetora.length; i++) {
			System.out.println("Informe o valor do vetor: "+i);
			vetora[i] = leia. nextInt();
			vetorb[i] = vetora[i]*i;
		}
		
		System.out.println("Vetor A: ");
		
		for(i=0; i<vetora.length; i++) {
			System.out.print(vetora[i]+" ");
		}
		
		
		System.out.println("\nVetor B: ");
		
		for(i=0; i<vetora.length; i++) {
		
			System.out.print(vetorb[i]+" ");
		}
		
	}

}