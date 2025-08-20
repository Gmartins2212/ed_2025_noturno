package ed_2025_noturno;

public class Principal {

	public static void main(String[] args) {
		
		Revista r1 = new Revista();
		r1.setNome("Quatro Rodas");
	
		Revista r2 = new Revista();
		r2.setNome("Turma da Mônica");
		
		System.out.println("Nome: "+r1.getNome());
		System.out.println("Nome: "+r2.getNome());
		
		Revista r3 = new Revista();
		r3.setAssunto("Automovel");
		
		Revista r4 = new Revista();
		r4.setAssunto("Infantil");
		
		System.out.println("Assunto: "+r3.getAssunto());
		System.out.println("Assunto: "+r4.getAssunto());
		
		Revista r5 = new Revista();
		r5.setPaginas(500);
		
		Revista r6 = new Revista();
		r6.setPaginas(400);
		
		System.out.println("Quantidade de páginas: "+r5.getPaginas());
		System.out.println("Quantidade de páginas: "+r6.getPaginas());
		
		
	}
	
}
