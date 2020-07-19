import java.util.Scanner;

public class aula04 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um valor em metros: ");
		Double n = leia.nextDouble();
		
		Double x = n * 100;
		
		System.out.println("O valor em centimentros é: " + x);
		
		
	}

}
