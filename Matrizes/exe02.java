package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class exe02 {
	
	public static void main (String args[]) {
		
		Scanner leia= new Scanner (System.in);
		
		int[][] maleatoria = new int[10][10];
		Random numRandom = new Random();
		
		for(int i=0;i<maleatoria.length;i++) {
			for(int j=0; j<maleatoria.length; j++) {
				maleatoria[i][j] = numRandom.nextInt(100);
				System.out.print(" "+maleatoria[i][j]);
			}
			System.out.println();
		}
		
		int maior=0;
		int menor=101;
		
		for(int i=0;i<maleatoria.length;i++) {
			for(int j=0; j<maleatoria.length; j++) {
				if(maleatoria[5][j]>maior) {
					maior = maleatoria[5][j];
				} 
			}
		}
		for(int i=0;i<maleatoria.length;i++) {
			for(int j=0; j<maleatoria.length; j++) {
				if (maleatoria[5][j]<menor) {
					menor = maleatoria[5][j];
				}
			}
		}
		
		System.out.println("O maior valor da linha 5 é o: "+ maior);
		System.out.println("O menor valor da linha 5 é o: "+ menor);
		
		int nmenor=101;
		int nmaior=0;
		
		for(int i=0;i<maleatoria.length;i++) {
				if(maleatoria[i][7]>nmaior) {
					nmaior = maleatoria[i][7];
				} 
			}
		
		for(int i=0;i<maleatoria.length;i++) {
			
				if (maleatoria[i][7]<nmenor) {
					nmenor = maleatoria[i][7];
				}
			}
		
		System.out.println("O maior valor da coluna 7 é o: "+ nmaior);
		System.out.println("O menor valor da coluna 7 é o: "+ nmenor);
	}
}
