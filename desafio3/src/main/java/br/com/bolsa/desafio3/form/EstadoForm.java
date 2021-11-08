package br.com.bolsa.desafio3.form;

import br.com.bolsa.desafio3.modelo.Estado;

public class EstadoForm {
	
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Long area;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Long getArea() {
		return area;
	}
	public void setArea(Long area) {
		this.area = area;
	}
	

	private void converter() {
        return new Estado();		
	}
}
