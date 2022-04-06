package com.djonata.sistemaAcademico.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.djonata.sistemaAcademico.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Modifying
	@Transactional
	@Query("delete from Curso where descricao = ?1")
	int removerCursoPorDescricao(String descricao);

	@Modifying
	@Transactional
	@Query(value = "update Curso set faculdade_id = ?1 where descricao = ?2")
	int updateTrocaDeFaculdadeCurso(@Param("faculdadeNova") Integer faculdadeNova,
			@Param("descricao") String descricao);
}
