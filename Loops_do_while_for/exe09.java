package Loops_do_while_for;

import java.util.Scanner;

public class exe09 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int i;
		
		for(i=0;i<50;i++) {
			if(i%3==0 && i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}