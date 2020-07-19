import java.util.Scanner;

public class aula11 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, a, b, c;
		
		System.out.println("Informe o valor de n1: ");
		n1= leia.nextInt();
		
		System.out.println("Informe o valor de n2: ");
		n2 = leia.nextInt();
		
		System.out.println("Informe o valor de n3: ");
		n3 = leia.nextInt();
		
		a = (n1*2) + (n2/2);
		
		b = (n1*3)+n3;
		
		c = n3*n3*n3;
		
		System.out.println("O valor de A, é: "+a);
		System.out.println("O valor de B, é: "+b);
		System.out.println("O valor de C, é: "+c);
		
	}

}
