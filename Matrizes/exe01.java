package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class exe01 {
	
	public static void main (String args[]) {
		
		Scanner leia= new Scanner (System.in);
		
		int[][] numerosAleatorios = new int[4][4];
		int l,c;
		Random numeroRandom = new Random();
		
		for(int i=0; i<numerosAleatorios.length ; i++) {	
			for(int j=0; j<numerosAleatorios.length ; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.println( i +"-"+ j + " : " + numerosAleatorios[i][j] + " ");
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for(int i=0; i<numerosAleatorios.length ; i++) {	
			for(int j=0; j<numerosAleatorios.length ; j++) {
				if (numerosAleatorios[i][j]> maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
		
	}

}
