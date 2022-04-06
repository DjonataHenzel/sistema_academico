package com.djonata.sistemaAcademico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.djonata.sistemaAcademico.repository.CursoRepository;
import com.djonata.sistemaAcademico.entity.Curso;
import java.util.List;

@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> buscarTodosCursos() {
		return cursoRepository.findAll();
	}

	public int apagarCursoPorDescricao(String descricaoCurso) {
		return cursoRepository.removerCursoPorDescricao(descricaoCurso);
	}

	public int alterarCursoDeFaculdade(Integer faculdadeNova, String nomeCurso) {
		return cursoRepository.updateTrocaDeFaculdadeCurso(faculdadeNova, nomeCurso);
	}
}
