package aula2;

public class Principal {

	public static void main(String[] args) {
		
		PF pf1 = new PF();
		pf1.nome = "Jhonathan Gabriel";
		pf1.cpf = "076.362.971-59";
		pf1.rg = "3.801.368";
		pf1.endereco = "Qs 11 Conj. A casa 55";
		pf1.telefone = "(61) 98286-6268";
		pf1.dataNascimento = "22/12/2003";
		
		PJ pj1 = new PJ();
		pj1.cnpj = "XX.XXX.XXX/0001-XX";
		pj1.razaoSocial = "Havan";
		pj1.inscricao = "22407820";
		pj1.endereco = "Valparaiso";
		pj1.telefone = "3321-8181";
		pj1.dataNascimento = "13/08/2025";
		
		System.out.println("nome:"+ pf1.nome + " - CPF:"+ pf1.cpf + " - RG:"+ pf1.rg + " - Endereço:"+ pf1.endereco + " - Telefone:"+ pf1.telefone + " - Data de Nascimento:"+ pf1.dataNascimento);
		System.out.println("Razão Social:"+ pj1.razaoSocial + " - CNPJ:"+ pj1.cnpj + " - Inscrição:" + pj1.inscricao + " - Endereço:"+ pj1.endereco + " - Telefone:"+ pj1.telefone + " - Data de Criação:" + pj1.dataNascimento);
		
		
				
		
		
	}
	
}
