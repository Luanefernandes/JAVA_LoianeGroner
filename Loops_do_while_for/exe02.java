package Loops_do_while_for;

import java.util.Scanner;

public class exe02 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		String usuario, senha;
		boolean valido = false;
		
		do {
		System.out.println("Informe o nome do usu�rio: ");
		usuario = leia.next();
		
		System.out.println("Informe a senha do usu�rio: ");
		senha = leia.next();
		
		if(usuario.equalsIgnoreCase(senha)) {
			valido = false;
			System.out.println("Usu�rio e senha iguais! Declare valores diferentes...");
		} else {
			valido = true;
			System.out.println("Login realizado com sucesso!!!...");
		}
		
		}
		
		while(!valido);

	}

}