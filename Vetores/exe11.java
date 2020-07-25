package Vetores;
import java.util.Scanner;

public class exe11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [10];
		int[] vetorb = new int [10];
		
		int i;
		
		for(i=0; i<vetora.length; i++) {
			System.out.println("A - Informe o valor do vetor "+i+" :");
			vetora[i] = leia. nextInt();
			
		}
		
		System.out.println("Vetor A: ");
		
		for(i=0; i<vetora.length; i++) {
			
			if(vetora[i]%2==0) {
			System.out.print(vetora[i]+" ");
			}
		}	
		
	}

}