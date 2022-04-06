package com.djonata.sistemaAcademico.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.djonata.sistemaAcademico.entity.Faculdade;

@Repository
public interface FaculdadeRepository extends JpaRepository<Faculdade, Long> {

	@Modifying
	@Transactional
	@Query("delete from Faculdade where razao_social = ?1")
	int removerFaculdadePorRazaoSocial(String razaoSocial);

	@Modifying
	@Transactional
	@Query(value = "update Faculdade set razao_social = ?1 where razao_social = ?2")
	int alterandoRazaoSocial(@Param("razaoSocialNova") String razaoSocialNova,
			@Param("razaoSocialAntiga") String razaoSocialAntiga);

}
