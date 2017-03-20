package com.br.cursojsf.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.br.cursojsf.dominio.Produto;
import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
@ManagedBean
@SessionScoped
public class GerenProdutoBen implements Serializable{

	private List<Produto>produtoss;
	private Produto produto;
	private Produto produtoSelecionado;
	private String nomePesquisa;
	private List<Produto> produtosFiltrados;
	
	
	public GerenProdutoBen(){
		this.produtoss =new ArrayList<Produto>();
		this.produtosFiltrados=new ArrayList<Produto>();
		this.produto = new Produto();
		
		}
	public void incluirProduto(){
		System.out.println("Incluindo....");
		this.produtoss.add(this.produto);
		this.produto =new Produto();
		
	}
	public Produto getProduto() {
		return produto;
	}
	public List<Produto> getProdutoss() {
		return produtoss;
	}
	
	
	
	
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}
	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
	
	
	
	
	public String getNomePesquisa() {
		return nomePesquisa;
	}
	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}
	
	public List<Produto> getProdutosFiltrados() {
		return produtosFiltrados;
	}
	public void setProdutosFiltrados(List<Produto> produtosFiltrados) {
		this.produtosFiltrados = produtosFiltrados;
	}
	
	
	
	public String obterAjunda(){
		if (this.produtoss.isEmpty()) {
			return "Ajuda?faces-redirect=true";
			
		} else {
			return "AjudaTelefone?faces-redirect=true";

		}
	}
	
	
	
	public void verificarInclusao(ActionEvent event){
		System.out.println("Verificando....");
		if("".equals(this.produto.getFabricante())){
			this.produto.setFabricante("Sem fabricante");
			
		}
		
		
		
		
	}
	public void excluir(){
		this.produtoss.remove(this.produtoSelecionado);
		
	}
	
	
	
	
	public void nomePesquisaAlterado(ValueChangeEvent event){
		System.out.println("Evando de mudança de valor......");
		System.out.println("Valor Atual: "+ this.nomePesquisa);
		System.out.println("Novo valor: "+event.getNewValue());
		
		this.produtosFiltrados.clear();
		for (Produto produto : this.produtoss) {
			if(produto.getNome()!=null && produto.getNome().toLowerCase().startsWith(event.getNewValue().toString().toLowerCase())){
				this.produtosFiltrados.add(produto);
			}
			
		}
	}
	

}
