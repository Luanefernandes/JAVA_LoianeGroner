import java.util.Scanner;

public class aula09 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		Double h, l,area,area2;
		
		System.out.println("Informe a largura do quadrado: ");
		l = leia.nextDouble();
		
		System.out.println("Informe a altura do quadrado: ");
		h = leia.nextDouble();
		
		area = l*h;
		
		area2 = area*area;
		
		System.out.println("O valor da �rea do quadrado �: "+area+ "m�\nE seu dobro �: "+area2+"m�");

}
}
