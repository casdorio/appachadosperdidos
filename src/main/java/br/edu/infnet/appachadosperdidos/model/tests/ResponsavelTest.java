package br.edu.infnet.appachadosperdidos.model.tests;

import br.edu.infnet.appachadosperdidos.model.domain.Responsavel;

public class ResponsavelTest {
	
	public static void main(String[] args) {

		Responsavel s1 = new Responsavel("huguinho", "12312312312", "hugo@hugo.com");
		System.out.println(s1);
		
		Responsavel s2 = new Responsavel("huguinho", "12312312312", "hugo@hugo.com");
		System.out.println(s2);
		
		Responsavel s3 = new Responsavel("huguinho", "12312312312", "hugo@hugo.com");
		System.out.println(s3);
		
	}
}
