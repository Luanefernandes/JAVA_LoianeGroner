import java.util.Scanner;

public class aula07 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe quantos graus está hoje (em Farenheit): ");
		Double f = leia.nextDouble();
		
		Double c = (5*(f-32)/9);
		
		System.out.println("A temperatura em Celsius é: "+c);
		
		
	}

}
