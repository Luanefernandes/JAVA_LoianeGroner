package Loops_do_while_for;

import java.util.Scanner;

public class exe02 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		String usuario, senha;
		boolean valido = false;
		
		do {
		System.out.println("Informe o nome do usuário: ");
		usuario = leia.next();
		
		System.out.println("Informe a senha do usuário: ");
		senha = leia.next();
		
		if(usuario.equalsIgnoreCase(senha)) {
			valido = false;
			System.out.println("Usuário e senha iguais! Declare valores diferentes...");
		} else {
			valido = true;
			System.out.println("Login realizado com sucesso!!!...");
		}
		
		}
		
		while(!valido);

	}

}