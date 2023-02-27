package br.edu.infnet.appachadosperdidos.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Registro {
	
	private String descricao;
	private boolean fl_perdido;
	private LocalDateTime dataRegistro;
	private Responsavel Responsavel;
	private List<Perdido> Perdidos;
		
	public Registro() {
		dataRegistro = LocalDateTime.now();
	}
		
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return  String.format("%s;%s;%s", 
				descricao, 
				fl_perdido ? "perdido" : "Não perdido",  
						dataRegistro.format(formato)
			);
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFl_perdido() {
		return fl_perdido;
	}

	public void setFl_perdido(boolean fl_perdido) {
		this.fl_perdido = fl_perdido;
	}

	public Responsavel getResponsavel() {
		return Responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		Responsavel = responsavel;
	}

	public List<Perdido> getPerdidos() {
		return Perdidos;
	}

	public void setPerdidos(List<Perdido> perdidos) {
		Perdidos = perdidos;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}
}
