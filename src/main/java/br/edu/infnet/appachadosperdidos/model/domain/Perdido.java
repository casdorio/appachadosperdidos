package br.edu.infnet.appachadosperdidos.model.domain;

import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public abstract class Perdido {

	private String codigo;
	private String nome;
	private float valor;
	
	
	public Perdido(String codigo, String nome, float valor) throws ValorZeradoException {
		
		if(valor == 0) {
			throw new ValorZeradoException("O valor do produto está zerado!");
		}
		
		if(valor < 0) {
			throw new ValorZeradoException("O valor do produto está negativo!");
		}
		
		
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public abstract float calcularValor() ;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(codigo);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(valor);

		return sb.toString();
	}
	
	public String getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public float getValor() {
		return valor;
	}
	
	
}
