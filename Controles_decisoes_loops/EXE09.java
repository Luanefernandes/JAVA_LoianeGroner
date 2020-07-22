package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE09 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double n1, n2, n3;
		
		System.out.println("Informe o valor de N1: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe o valor de N2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Informe o valor de N3: ");
		n3 = leia.nextDouble();		
		
		if(n1 > n2 && n1 > n3) {
			if(n2>n3){
				System.out.println(n1+" "+n2+" "+n3);
			} else {
				System.out.println(n1+" "+n3+" "+n2);
			}

		} else if (n2 > n1 && n2 > n3) {
			if (n1>n3){
				System.out.println(n2+" "+n1+" "+n3);
			} else {
				System.out.println(n2+" "+n3+" "+n1);
			}
			
		} else if(n3 > n1 && n3 > n2){
			if(n1>n2) {
				System.out.println(n3+" "+n1+" "+n2);
			} else {
				System.out.println(n3+" "+n2+" "+n1);
			}
			
		}
		

		
	}
	

}