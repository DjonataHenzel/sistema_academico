package com.djonata.sistemaAcademico.entity;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
	@DateTimeFormat(style = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime dataCadastro;

	@Column(nullable = false)
	@DateTimeFormat(style = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime dataAlteracao;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curso_id", nullable = false)
	private Curso curso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargHorariaTotal() {
		return cargHorariaTotal;
	}

	public void setCargHorariaTotal(int cargHorariaTotal) {
		this.cargHorariaTotal = cargHorariaTotal;
	}

	public int getCargHorariaPratica() {
		return cargHorariaPratica;
	}

	public void setCargHorariaPratica(int cargHorariaPratica) {
		this.cargHorariaPratica = cargHorariaPratica;
	}

	public int getCargHorariaTeorica() {
		return cargHorariaTeorica;
	}

	public void setCargHorariaTeorica(int cargHorariaTeorica) {
		this.cargHorariaTeorica = cargHorariaTeorica;
	}

	public int getQtAlunos() {
		return qtAlunos;
	}

	public void setQtAlunos(int qtAlunos) {
		this.qtAlunos = qtAlunos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
