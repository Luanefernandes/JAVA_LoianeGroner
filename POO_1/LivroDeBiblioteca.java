package POO_1;

public class LivroDeBiblioteca {
	
	public static void main(String[] args) {
	
	livro Hobbit = new livro ();
	Hobbit.ano = 1937;
	Hobbit.autor = "J. R. R. Tolkien";
	Hobbit.quantidade = 210;
	Hobbit.titulo = "O Hobbit";
	Hobbit.valor = 36.40;
	Hobbit.disponivel = true;
	
	System.out.println(Hobbit.titulo);
	System.out.println(Hobbit.ano);
	System.out.println(Hobbit.autor);
	System.out.println(Hobbit.quantidade);
	System.out.println(Hobbit.valor);
	System.out.println(Hobbit.disponivel);
	
	}


}
