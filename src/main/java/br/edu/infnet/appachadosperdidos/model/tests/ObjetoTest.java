package br.edu.infnet.appachadosperdidos.model.tests;

import br.edu.infnet.appachadosperdidos.model.domain.Objeto;
import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public class ObjetoTest {

	public static void main(String[] args) {

		try {
			Objeto b1 = new Objeto("12", "biruta", 0);
			b1.setTipo("caramelho com branco");
			b1.setTamanho(10);
			b1.setCaracteristica("cor azul");
			System.out.println(b1);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {

			Objeto b2 = new Objeto("121", "birsacsvfcvsuta", 0);
			b2.setTipo("caramelho com vasvavbranco");
			b2.setTamanho(100);
			b2.setCaracteristica("cor avsvaazul");
			System.out.println(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Objeto b3 = new Objeto("112", "casdaca", 0);
			b3.setTipo("caramcascsacelho com branco");
			b3.setTamanho(102);
			b3.setCaracteristica("cor cascacazul");
			System.out.println(b3);

		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
