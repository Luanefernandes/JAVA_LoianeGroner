package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class exe02_2 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		int[][] maleatoria = new int[10][10];
		Random numRandom = new Random();
		
		for(int i=0;i<maleatoria.length;i++) {
			for(int j=0; j<maleatoria.length; j++) {
				maleatoria[i][j] = numRandom.nextInt(100);
			}
		}
		
		for(int i=0;i<maleatoria.length;i++) {
			for(int j=0; j<maleatoria.length; j++) {
				System.out.print(maleatoria[i][j] + " ");
			}
			System.out.println();
		}
		
		int maiorL5=0, menorL5= 101, linha5=5;
		
		for(int i=0;i<maleatoria[linha5].length;i++) {
				if(maleatoria[linha5][i]>maiorL5) {
					maiorL5 = maleatoria[linha5][i];
				} 
				if(maleatoria[linha5][i]<menorL5) {
					menorL5 = maleatoria[linha5][i];
				} 
			}
		
		System.out.println("O maior valor da linha 5 é o: "+ maiorL5);
		System.out.println("O menor valor da linha 5 é o: "+ menorL5);
		
		int maiorL7=0, menorL7=101, linha7=7;
		
		for(int i=0;i<maleatoria[linha7].length;i++) {
				if(maleatoria[i][linha7]>maiorL7) {
					maiorL7 = maleatoria[i][linha7];
				} 
				if(maleatoria[i][linha7]<menorL7) {
					menorL7 = maleatoria[i][linha7];
				} 
			}
		
		System.out.println("O maior valor da coluna 7 é o: "+ maiorL7);
		System.out.println("O menor valor da coluna 7 é o: "+ menorL7);

	}

}
