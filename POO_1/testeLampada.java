package POO_1;

public class testeLampada {
	
	public static void main(String[] args) {
		
		lampada l1 = new lampada();
		l1.marca = "Phillips";
		l1.modelo = "Led";
		l1.quantidadeLampada = 210;
		l1.valor = 236.25;
		l1.voltagem = 210;
		
		System.out.println(l1.marca);
		System.out.println(l1.modelo);
		System.out.println(l1.valor);
		System.out.println(l1.quantidadeLampada);
		System.out.println(l1.voltagem);
		
	}

}
