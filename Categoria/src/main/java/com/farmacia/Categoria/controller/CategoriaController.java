package com.farmacia.Categoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.Categoria.model.categoria;
import com.farmacia.Categoria.repository.CategoriaRepository;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<categoria>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id")
	public ResponseEntity<categoria> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<categoria>> getBydescricao(@PathVariable String descricao)
	{
		return ResponseEntity.ok(repository.findAllBydescricao(descricao));
	}
	
	@GetMapping("/ativo/{ativo}")
	public ResponseEntity<List<categoria>> getByAtivo(@PathVariable Boolean ativo)
	{
		return ResponseEntity.ok(repository.findAllByAtivo(ativo));
	}
	
	@PostMapping
	public ResponseEntity<categoria> post (categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<categoria> put (@RequestBody categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
