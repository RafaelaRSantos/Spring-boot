package com.criaco.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.criaco.demo.model.Pessoas;
import com.criaco.demo.repository.PessoasRepository;

@RestController
@RequestMapping("/Pessoas")
public class PessoasController {
	
	
	@Autowired
	private PessoasRepository pessoasRepository;
	
	@GetMapping
	public List<Pessoas > Listar () {
		return pessoasRepository.findAll();	
	}
     
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoas adicionar(@RequestBody Pessoas pessoas) {
		return pessoasRepository.save(pessoas);
   }
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	 public List<Pessoas> deletar(@RequestBody Pessoas pessoas) {
		return pessoasRepository.findAll();
		  
	 }
	
	@PutMapping("/Pessoas{id}")
	public Optional<Pessoas> update (@PathVariable("id") long id,
            @RequestBody Pessoas pessoas) {
		return pessoasRepository.findById(id);
			
	}
		}
		
	 
