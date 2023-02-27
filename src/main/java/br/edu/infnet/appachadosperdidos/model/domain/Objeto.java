package br.edu.infnet.appachadosperdidos.model.domain;

import br.edu.infnet.appachadosperdidos.model.exceptions.ValorZeradoException;

public class Objeto extends Perdido {


	private String tipo;
	private int tamanho;
	private String caracteristica;
	
	public Objeto(String codigo, String nome, float valor) throws ValorZeradoException{
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
		sb.append(tipo);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(caracteristica);

		return sb.toString();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	
	
	
}
