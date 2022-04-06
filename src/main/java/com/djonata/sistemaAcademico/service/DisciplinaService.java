package com.djonata.sistemaAcademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djonata.sistemaAcademico.entity.Disciplina;
import com.djonata.sistemaAcademico.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository disciplinaRepository;

	public List<Disciplina> buscarTodosDisciplinas() {
		return disciplinaRepository.findAll();
	}

	public int apagarDisciplinaPorDescricao(String descricaoDisciplina) {
		return disciplinaRepository.removerDisciplinaPorDescricao(descricaoDisciplina);
	}

	public int alterarDisciplinaDeCurso(Integer cursoNova, String nomeDisciplina) {
		return disciplinaRepository.updateTrocaDeCursoParaDisciplina(cursoNova, nomeDisciplina);
	}
}
