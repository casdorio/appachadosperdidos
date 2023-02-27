package br.edu.infnet.appachadosperdidos.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appachadosperdidos.model.domain.Perdido;
import br.edu.infnet.appachadosperdidos.model.domain.Pessoa;
import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;


public class RegistroTest {
	
	public static void main(String[] args) {
		
		List<Perdido> perdidosP1 = new ArrayList<Perdido>();
		List<Perdido> perdidosP2 = new ArrayList<Perdido>();
		List<Perdido> perdidosP3 = new ArrayList<Perdido>();
		List<Perdido> perdidosP4 = new ArrayList<Perdido>();
		
		
		try {
			Pessoa b1 = new Pessoa("tem problema de coração", "cafezin", 5);
			b1.setNome("carlos");
			b1.setTamanho(500);

			perdidosP1.add(b1);
			perdidosP2.add(b1);
			perdidosP3.add(b1);
			perdidosP4.add(b1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
	}
}
