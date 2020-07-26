package Matrizes;

import java.util.Scanner;

public class exe03 {
	
	public static void main (String args[]) {
		
		Scanner leia= new Scanner (System.in);
		int somapares=0, somaimpares=0;
		
		int[][] matriz = new int [3][3];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz.length;j++) {
				System.out.println(i+ " : "+j+" - Informe um valor: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz.length;j++) {
				if(matriz[i][j]%2==0) {
					somapares++;
				}
				if(matriz[i][j]%2!=0) {
					somaimpares++;
				}
			}
			System.out.println();
		}
		
		System.out.println("A quantidade de números pares é: "+somapares);
		System.out.println("A quantidade de números impares é: "+somaimpares);
		
	}
}
