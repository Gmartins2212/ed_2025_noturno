package aula2;

public class Principal {

	public static void main(String[] args) {
		
		Revista revista1 = new Revista();
		revista1.edicao = "Outono";
		revista1.mesPublicacao = "março";
		
		Livro livro1 = new Livro();
		livro1.autor = "G.Martins";
		livro1.numeroPagina = 1000;
		
		Tese tese1 = new Tese();
		tese1.autor = "Thanos";
		tese1.cursorOrigem = "Acabar com a metade da população do planeta Terra para ter paz...";
		
		System.out.println("Minha História - Autor: "+ livro1.autor +" - Quantidades de páginas: "+ livro1.numeroPagina + "Páginas.");
		System.out.println("Revista - Edição: "+ revista1.edicao + " - Mês de publicação: "+ revista1.mesPublicacao+"."); 							
		System.out.println("Tese - Cursor: "+ tese1.cursorOrigem + " - Autor: "+ tese1.autor+".");
		
	}
	 
}
