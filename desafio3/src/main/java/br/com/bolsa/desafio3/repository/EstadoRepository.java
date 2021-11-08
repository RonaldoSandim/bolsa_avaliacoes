package br.com.bolsa.desafio3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bolsa.desafio3.modelo.Estado;

public interface EstadoRepository  extends JpaRepository<Estado, Long> {

}
