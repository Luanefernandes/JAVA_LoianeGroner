import java.util.Scanner;

public class aula06 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o valor que voc� recebe por hora: ");
		Double hora = leia.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no m�s: ");
		Double mes = leia.nextDouble();
		
		Double total = hora * mes;
		
		System.out.println("O valor a receber no m�s �: "+total);
		
		
	}

}
