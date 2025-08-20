package Aula1;

public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.marca = "Toyota";
		c1.modelo = "Corolla";
		c1.ano = "2011/2012";
		
		System.out.println("Marca:"+ c1.marca + " - Modelo:"+ c1.modelo + " - Ano:"+ c1.ano);
		c1.acelerar();
	}
	
}
