import java.util.Scanner;

public class aula12 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		Double peso, h;
		
		System.out.println("Informe sua altura: ");
		h = leia.nextDouble();
		
		peso = (72.7*h)-58;
				
		System.out.println("Seu peso ideal é: "+peso);
		
	}

}
