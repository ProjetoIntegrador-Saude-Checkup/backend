package com.generation.saudecheckup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.saudecheckup.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema>findAllByAssuntoContainingIgnoreCase(@Param("assunto")String assunto);

}
