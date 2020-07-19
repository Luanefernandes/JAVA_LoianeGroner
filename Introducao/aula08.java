import java.util.Scanner;

public class aula08 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		Double n1 = leia.nextDouble();
		
		System.out.println("Informe um número: ");
		Double n2 = leia.nextDouble();

		Double soma = n1+n2;
		
		System.out.println("A soma deles é: " + soma);
		
		
		
}
}