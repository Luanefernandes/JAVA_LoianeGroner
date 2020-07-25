package Vetores;
import java.util.Scanner;

public class exe07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [10];
		int[] vetorb = new int [10];
		int[] vetorc = new int [10];
		
		int i;
		
		for(i=0; i<vetora.length; i++) {
			System.out.println("A - Informe o valor do vetor "+i+" :");
			vetora[i] = leia. nextInt();
			System.out.println("B - Informe o valor do vetor "+i+" :");
			vetorb[i] = leia. nextInt();
			vetorc[i] = vetora[i]-vetorb[i];
		}
		
		System.out.println("Vetor A: ");
		
		for(i=0; i<vetora.length; i++) {
			System.out.print(vetora[i]+" ");
		}
		
		
		System.out.println("\nVetor B: ");
		
		for(i=0; i<vetora.length; i++) {
		
			System.out.print(vetorb[i]+" ");
		}
		
		System.out.println("\nVetor C: ");
		
		for(i=0; i<vetora.length; i++) {
		
			System.out.print(vetorc[i]+" ");
		}
		
	}

}