package POO_5_RelacionamentoClasses;

import java.util.Scanner;

public class Exer01 {
	
	public static void main (String args[]) {
		
		Scanner scan - new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		
		Contato1[] contatos = new Contato1[3];
		
		for (int i=0; i<3; i++) {
			
			System.out.println("Entre com as informações do contato "+ (1+i));
			Contato1 c = new Contato1();
			
			System.out.println("Entre com as informações do nome "+ (1+i));
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com as informações do telefone "+ (1+i));
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com as informações do telefone "+ (1+i));
			String email = scan.nextLine();
			c.setEmail(email);
					
		}
		agenda.setContatos(contatos1);
	}

}
