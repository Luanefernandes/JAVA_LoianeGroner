package Loops_do_while_for;

import java.util.Scanner;

public class exe10 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);

		int i, n1, n2;
		
		System.out.println("Informa o valor de n1: ");
		n1 = leia.nextInt();
		
		System.out.println("Informa o valor de n2: ");
		n2 = leia.nextInt();
		
		
		while(n1<n2)
			{
				n1++;
				System.out.print(n1+" ");
			}
		
		while(n1>n2)
		{
			n2++;
			System.out.print(n2+" ");
		}
		
		}
		
	}

