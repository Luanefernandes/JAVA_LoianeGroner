package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE03 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Informe se você é F ou M: ");
		String input = leia.next();
		
		if (input.equalsIgnoreCase ("f")) {
			System.out.println("F - feminino");
		} else if (input.equalsIgnoreCase("m")){
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
