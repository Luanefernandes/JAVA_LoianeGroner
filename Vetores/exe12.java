package Vetores;
import java.util.Scanner;

public class exe12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [10];
		int[] vetorb = new int [10];
		int soma = 0;
		
		int i;
		
		for(i=0; i<vetora.length; i++) {
			System.out.println("A - Informe o valor do vetor "+i+" :");
			vetora[i] = leia. nextInt();
			
			soma = soma + vetora[i];
			
		}
		
		System.out.println("Vetor A: ");
		
		for(i=0; i<vetora.length; i++) {
			
			System.out.print(vetora[i]+" ");
			
		}	
		System.out.println("\nA soma dos elementos é: "+soma);
	}

}