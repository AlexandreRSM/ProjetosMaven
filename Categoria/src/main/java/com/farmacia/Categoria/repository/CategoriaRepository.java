package com.farmacia.Categoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Categoria.model.categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Long> {
	public List<categoria> findAllById(String categoria);
	
	public List<categoria> findAllBydescricao(String categoria);
	
	public List<categoria> findAllByAtivo(Boolean ativo);
	
}
