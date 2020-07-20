package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE02 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int n;
		
		System.out.println("Informe um valor positivo ou negativo: ");
		n = leia.nextInt();
		
		if (n<0) {
			System.out.println("Este número é negativo!!!");
		}
		else {
			System.out.println("Este número é positivo!!!");
		}
		
	}

}
