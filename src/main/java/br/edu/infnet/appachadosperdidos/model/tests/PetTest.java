package br.edu.infnet.appachadosperdidos.model.tests;

import br.edu.infnet.appachadosperdidos.model.domain.Pet;
import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public class PetTest {
	
	public static void main(String[] args) {
		
		
		try {
			
			Pet b1 = new Pet("12", "biruta", 0);
			b1.setRaca("pitbull");
			b1.setIdade(10);
			b1.setNome("adalto");
			b1.setGenero(1);
			System.out.println(b1);
			
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		

		
	}
}
