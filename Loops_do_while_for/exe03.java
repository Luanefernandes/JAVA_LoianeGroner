package Loops_do_while_for;

import java.util.Scanner;

public class exe03 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		String nome, nome1 = "abc", sexo, civil;
		int idade;
		boolean nomevalido = false;
		boolean idadevalida = false;
		boolean salvalido = false;
		double salario;
		boolean sexovalido = false;
		boolean estadocivil = false;
		
		do {
			System.out.println("Informe seu nome: ");
			nome = leia.next();
			
			if (nome.length() > 3) {
				
				nomevalido = true;

			} else {
				nomevalido = false;
				System.out.println("Nome inv�lido. Deve conter acima de 3 caracteres. informe novamente:");
			}	
		}
		
		while(!nomevalido);
		
		do {
			
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			
			if (idade>0 && idade<150) {
				
				idadevalida = true;
				
			} else {
				idadevalida = false;
				System.out.println("Idade inv�lida. Tente novamente: ");
			}	
		}
		
		while(!idadevalida);
		
		do {
			
			System.out.println("Informe seu sal�rio: ");
			salario = leia.nextDouble();
			
			if (salario>0) {
				
				salvalido = true;
						
			} else {
				salvalido = false;
				System.out.println("Sal�rio inv�lido. Tente novamente. ");
			}	
		}
		
		while(!salvalido);
		
		do {
			
			System.out.println("Informe seu sexo: ");
			sexo = leia.next();
			
			if (sexo.equalsIgnoreCase("m")) {
				
				sexovalido = true;
				
			} else if (sexo.equalsIgnoreCase("f")) {
				
				sexovalido = true;

			} else {
				sexovalido = false;
				System.out.println("Sexo inv�lido. Tente novamente. ");
			}
		}
		
		while(!sexovalido);
		
		do {
			
			System.out.println("Informe seu estado civil: \nS - Solteira(o) \nC - casada(o) \nV - Vi�va(o) \nD - Duvidosa(o)");
			civil = leia.next();
			
			if (civil.equalsIgnoreCase("s")) {
				
				estadocivil = true;
				
			} else if (civil.equalsIgnoreCase("c")) {
				
				estadocivil = true;
				
			} else if (civil.equalsIgnoreCase("v")){
				
				estadocivil = true;
				
			} else if (civil.equalsIgnoreCase("d")){
				
				estadocivil = true;
				
			} else {
				
				estadocivil = false;
				System.out.println("Sexo inv�lido. Tente novamente. ");
				
			}
		}
		
		while(!estadocivil);
		
		System.out.println("Seu nome �: "+ nome);
		System.out.println("Sua idade �: "+ idade);
		System.out.println("Seu sal�rio �: "+ salario);
		System.out.println("Seu sexo �: "+ sexo);
		System.out.println("Seu estado civil �: "+ civil);
		
	}
		
	}


