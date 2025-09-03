package Zoologico;

public class Cachorro extends Animal {
	
	public String raca;
	
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String emitirSom() {
		return "Latir"; 
		
	}

	@Override
	public String alimentar() {
		return "ração";
	}
	
	
}
