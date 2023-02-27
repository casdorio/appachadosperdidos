package br.edu.infnet.appachadosperdidos.model.tests;

import br.edu.infnet.appachadosperdidos.model.domain.Pessoa;
import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public class PessoaTest {

	public static void main(String[] args) {

		try {
			Pessoa b1 = new Pessoa("12", "biruta", 0);
			b1.setIdade(12);
			b1.setTamanho(10);
			b1.setNome("adalto");
			b1.setGenero(1);
			System.out.println(b1);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
