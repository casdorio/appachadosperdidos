package br.edu.infnet.appachadosperdidos.model.domain;

import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public class Pessoa extends Perdido {

	private int idade;
	private int tamanho;
	private String nome;
	private int genero;


	public Pessoa(String codigo, String nome, float valor) throws ValorZeradoException {
		super(codigo, nome, valor);
	}
	
	@Override
	public float calcularValor(){
		return 0;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(idade);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(genero);

		return sb.toString();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	
}
