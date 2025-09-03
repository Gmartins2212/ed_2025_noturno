
package Zoologico;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Animal> minhaLista = new ArrayList<>();
		
		Cachorro C1 = new Cachorro();
		C1.setNome("Caramelo");
		C1.setIdade(5);
		C1.setPeso(20.5);
		C1.setHabitat("Doméstico");
		//Methods
		C1.emitirSom();
		C1.alimentar();
		
		Gato G1 = new Gato();
		G1.setNome("Xanin");
		G1.setIdade(3);
		G1.setPeso(4.35);
		G1.setHabitat("Doméstico");
		//Methods
		G1.emitirSom();
		G1.alimentar();
		
		Leao L1 = new Leao();
		L1.setNome("Simba");
		L1.setIdade(10);
		L1.setPeso(250);
		L1.setHabitat("Selva");
		//methods
		L1.emitirSom();
		L1.alimentar();
		
		
		minhaLista.add(L1);
		minhaLista.add(G1);
		minhaLista.add(C1);
		
		System.out.println("Imprimindo a lista:");
		for (Animal animal : minhaLista) {
			System.out.println(animal.getNome());
		
		}
		
	}
}

