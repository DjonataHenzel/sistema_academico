package com.djonata.sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.djonata.sistemaAcademico.entity.FaculdadeEntity;

@Repository
public interface FaculdadeRepository extends JpaRepository<FaculdadeEntity, Long>{

}
