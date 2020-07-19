import java.util.Scanner;

public class aula03 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe uma nota: ");
		int nota1 = leia.nextInt();
		
		System.out.println("Informe uma nota: ");
		int nota2 = leia.nextInt();
		
		System.out.println("Informe uma nota: ");
		int nota3 = leia.nextInt();
		
		System.out.println("Informe uma nota: ");
		int nota4 = leia.nextInt();
		
		int media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média das notas é: "+ media);
		
	}

}
