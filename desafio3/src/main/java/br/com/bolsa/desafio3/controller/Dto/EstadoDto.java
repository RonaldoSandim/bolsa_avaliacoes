package br.com.bolsa.desafio3.controller.Dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bolsa.desafio3.modelo.Estado;

public class EstadoDto {
	
	private Long id;
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Long area;
	
	public EstadoDto(Estado estados) {
		this.id = estados.getId();
		this.nome = estados.getNome();
		this.regiao = estados.getRegiao();
		this.populacao = estados.getPopulacao();
		this.capital = estados.getCapital();
		this.area = (long) estados.getArea();

	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public Long getPopulacao() {
		return populacao;
	}
	public String getCapital() {
		return capital;
	}
	public Long getArea() {
		return area;
	}

	public static List<EstadoDto> converter(List<Estado> estados) {
		return  estados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}
}
