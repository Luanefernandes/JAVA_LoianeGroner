package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE10 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int op;
		
		System.out.println("Olá! Informe em qual período você estuda: \n1) Matutino \n2) Vespertino \n3) Noturno");
		op = leia.nextInt();
		
		if (op == 1) {
			System.out.println("Bom dia!!!!!!!");
		} else if (op ==2) {
			System.out.println("Boa tardeeeeeee!!!!!!!");
		} else if (op ==3) {
			System.out.println("Boa noiteeeeeeee!!!! ZZZZzzzzzZZZZzzzzzz...");
		} else {
			System.out.println("Valor inválido...");
		}
		
		
	}

}
