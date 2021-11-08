package br.com.bolsa.desafio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bolsa.desafio3.controller.Dto.EstadoDto;
import br.com.bolsa.desafio3.form.EstadoForm;
import br.com.bolsa.desafio3.modelo.Estado;
import br.com.bolsa.desafio3.repository.EstadoRepository;

@RestController
@RequestMapping("api/estados")
public class EstadoController {

	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<EstadoDto> listaEstado() {  
		
		List<Estado> estados = estadoRepository.findAll();
		 return EstadoDto.converter(estados); //passa vários objetos
        
        }
	
	@PostMapping
	public void cadastrar(@RequestBody EstadoForm  form) {
		
		Estado estado=form converter();
		estadoRepository.save(estado);
	}

	
	
}
