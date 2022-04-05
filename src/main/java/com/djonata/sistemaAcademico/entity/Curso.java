package com.djonata.sistemaAcademico.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 70)
	private String descricao;
	
	@Column(nullable = false)
	private String usuario;
	
	@Column(nullable = false)
	private Date dataCadastro;
	
	@Column(nullable = false)
	private Date dataAlteracao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "faculdade_id", nullable = false)
	private Faculdade faculdade;
	
	



}
