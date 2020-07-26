package POO_1;

public class testeContaBancaria {

	public static void main(String[] args) {

		contaBancaria itau = new contaBancaria();
		itau.agencia = 78;
		itau.conta = 98757;
		itau.nome = "Luane Fernandes";
		itau.especial = false;
		itau.saldo = 278903.98;
		
		System.out.println(itau.nome);
		System.out.println(itau.conta);
		System.out.println(itau.agencia);
		System.out.println(itau.saldo);
		System.out.println(itau.especial);

	}

}
