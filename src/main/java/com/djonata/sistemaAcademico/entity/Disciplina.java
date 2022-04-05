package com.djonata.sistemaAcademico.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 70)
	private String descricao;
	
	@Column(nullable = false)
	private int cargHorariaTotal;
	
	@Column(nullable = false)
	private int cargHorariaPratica;
	
	@Column(nullable = false)
	private int cargHorariaTeorica;
	
	@Column(nullable = false)
	private int qtAlunos;
	
	@Column(nullable = false)
	private String usuario;

	@Column(nullable = false)
	private Date dataCadastro;

	@Column(nullable = false)
	private Date dataAlteracao;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curso_id", nullable = false)
	private Curso curso;

}
