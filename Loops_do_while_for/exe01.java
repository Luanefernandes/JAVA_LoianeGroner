package Loops_do_while_for;

import java.util.Scanner;

public class exe01 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int valor;
		boolean valorvalido = false;
		
		do { System.out.println("Informe um valor v�lido: ");
		valor = leia.nextInt();
		
			if (valor>=0 && valor<=10) {
				valorvalido = true;
				System.out.println("Voc� digitou o valor: "+valor);
				valor = leia.nextInt();
			} else {
				valorvalido = false;
				System.out.println("Valor inv�lido!!! ");
			}
			
		} 
		while (!valorvalido);
		
	}

}
