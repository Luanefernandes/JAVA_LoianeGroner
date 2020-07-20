package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE04 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Informe uma letra: ");
		String letra = leia.next();
		
		switch (letra) {
		
		case "a":
			System.out.println("Essa letra é uma vogal!!!");
			break;
		case "e":
			System.out.println("Essa letra é uma vogal!!!");	
			break;
		case "i":
			System.out.println("Essa letra é uma vogal!!!");	
			break;
		case "o":
			System.out.println("Essa letra é uma vogal!!!");
			break;
		case "u":
			System.out.println("Essa letra é uma vogal!!!");
			break;
			
		default:
			System.out.println("Esta letra é uma consoante!!!");
		
		}
		
		
	}

}
