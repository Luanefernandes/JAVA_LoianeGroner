package Loops_do_while_for;

import java.util.Scanner;

public class exe07 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int n, i=1, maiorn;
		
		do {
			
			System.out.println("N�mero "+ i + ": ");
			n = leia.nextInt();
			maiorn = n;
			
			if (n > maiorn) {
				maiorn = n;
			}
			
			i++;
		
		} while (i<=3);
			
			System.out.println("O n�mero maior �: "+n);

	}

}