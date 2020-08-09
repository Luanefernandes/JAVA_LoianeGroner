package POO_3_EstaticMethod;

public class EXE01 {
	
	static void imprimirValor() {
		
		System.out.println(Contador.obertValor());
		
	}
	
	public static void main(String args[]) {
		
		System.out.println();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
	}

}
