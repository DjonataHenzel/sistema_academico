package com.djonata.sistemaAcademico.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.djonata.sistemaAcademico.entity.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

	@Modifying
	@Transactional
	@Query("delete from Disciplina where descricao = ?1")
	int removerDisciplinaPorDescricao(String descricaoDisciplina);

	@Modifying
	@Transactional
	@Query(value = "update Disciplina set curso_id = ?1 where descricao = ?2")
	int updateTrocaDeCursoParaDisciplina(@Param("cursoNovo") Integer cursoNovo, @Param("descricao") String descricao);
}
