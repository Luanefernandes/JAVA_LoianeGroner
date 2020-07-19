import java.util.Scanner;

public class aula10 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		Double c, f=1.0;
		
		System.out.println("Informe quantos graus está hoje (em Celsius): ");
		c = leia.nextDouble();
		
		f = ((c*9)+32)/5;
		
		System.out.println("A temperatura em Ferenheit é: "+f);
		
		
	}

}
