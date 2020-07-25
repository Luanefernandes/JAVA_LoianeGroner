package Vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe04 {
	
	public static void main (String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner leia = new Scanner (System.in);
		
		int[] vetora = new int [8];
		double[] vetorb = new double [vetora.length];
		
		int i;
		
		for(i=0; i<vetora.length; i++) {
			System.out.println("Informe o valor do vetor "+i);
			vetora[i] = leia. nextInt();
			vetorb[i] = Math.sqrt(vetora[i]);
		}
		
		System.out.println("Vetor A: ");
		
		for(i=0; i<vetora.length; i++) {
			System.out.print(vetora[i]+" ");
		}
		
		
		System.out.println("\nVetor B: ");
		
		for(i=0; i<vetora.length; i++) {
		
			System.out.print(formatador.format(vetorb[i]+" "));
		}
		
	}

}