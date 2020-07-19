import java.util.Scanner;

public class aula14 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual o tamanho do arquivo em MB? ");
		Double mb = leia.nextDouble();
		
		System.out.println("Qual o tamanho do arquivo em Mbps? ");
		Double mbps = leia.nextDouble();
		
		Double total = mb*mbps;
		
		System.out.println("O tempo de download é: "+total+" minutos");
		
		
	}

}
