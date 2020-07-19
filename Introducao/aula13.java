import java.util.Scanner;

public class aula13 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double ir, inss, sind, liq;
		
		
		System.out.println("Informe o valor que você recebe por hora: ");
		Double hora = leia.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		Double mes = leia.nextDouble();
		
		Double total = hora * mes;
		
		inss = 0.08 * total;
		
		sind = 0.05 * total;
		
		liq = total + inss + sind;
		
		System.out.println("Seu salário bruto é: "+liq);
		
		System.out.println("Seu salário líquido é: "+total);
		
		
		
	}

}
