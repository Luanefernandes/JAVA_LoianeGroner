import java.util.Scanner;

public class aula05 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o raio de um c�rculo: ");
		Double raio = leia.nextDouble();
		
		Double area = 3.14*((Math.pow(raio, 2)));
		
		System.out.printf("A �rea deste c�rculo �: "+area);
		
		
	}

}
