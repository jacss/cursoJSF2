package com.br.cursojsf.dominio;

import java.io.Serializable;

public class Produto implements Serializable{
	private String nome;
	private String fabricante;
	private String categoria;
	
//	public Produto(){
//		
//	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
