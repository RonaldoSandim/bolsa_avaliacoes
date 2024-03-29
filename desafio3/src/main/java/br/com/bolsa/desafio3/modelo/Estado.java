
package br.com.bolsa.desafio3.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Long area;
	
	public Estado() {
		
	}
	
	public Estado(String nome, String regiao, Long populacao, String capital, Long area) {		
		
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public double getArea() {
		return area;
	}


	public void setArea(Long area) {
		this.area = area;
	}

	
	
}
