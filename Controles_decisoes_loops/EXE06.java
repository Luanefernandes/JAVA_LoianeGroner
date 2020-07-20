package Controles_decisoes_loops;

import java.util.Scanner;

public class EXE06 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double nota1, nota2, media;
		
		System.out.println("Informe o valor da nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe o valor da nota 1: ");
		nota2 = leia.nextDouble();
		
		media=(nota1+nota2)/2;
		
		if(media==10) {
			System.out.println("Você foi aprovado com distinção!!");
		} else if (media < 7) {
			System.out.println("Você foi reprovado! ");
		} else if(media >= 10){
			System.out.println("Você foi aprovado!!!");
		}
		
	}
	

}