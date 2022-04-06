package com.djonata.sistemaAcademico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.djonata.sistemaAcademico.entity.Curso;
import com.djonata.sistemaAcademico.entity.Disciplina;
import com.djonata.sistemaAcademico.entity.Faculdade;
import com.djonata.sistemaAcademico.repository.CursoRepository;
import com.djonata.sistemaAcademico.repository.DisciplinaRepository;
import com.djonata.sistemaAcademico.repository.FaculdadeRepository;
import com.djonata.sistemaAcademico.service.CursoService;
import com.djonata.sistemaAcademico.service.DisciplinaService;
import com.djonata.sistemaAcademico.service.FaculdadeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SistemaAcademicoApplication {
	private static final Logger log = LoggerFactory.getLogger(SistemaAcademicoApplication.class);
	@Autowired
	FaculdadeRepository faculdadeRepository;

	@Autowired
	CursoRepository cursoRepository;

	@Autowired
	DisciplinaRepository disciplinaRepository;

	public static void main(String[] args) {
		System.out.println("Sistema de cadastro");
		SpringApplication.run(SistemaAcademicoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CursoService cursoService, FaculdadeService faculdadeService,
			DisciplinaService disciplinaService) {
		return (arg) -> {
			log.info("-----------------------INSERT------------------------------");
			log.info("----iNSERT FORAM FEITOS NA CLASSE (InseridosDadosIniciais)-");

			log.info("-----------------------------------------------------------");

			log.info("------------------------READ-------------------------------");
			log.info("------------------TODOS CURSOS-----------------------------");
			for (Curso curso : cursoService.buscarTodosCursos()) {
				log.info(curso.toString());
				log.info("");
			}

			log.info("------------------TODAS DISCIPLINAS------------------------");
			for (Disciplina disciplina : disciplinaService.buscarTodosDisciplinas()) {
				log.info(disciplina.toString());
				log.info("");
			}

			log.info("------------------TODAS FACULDADE--------------------------");
			for (Faculdade faculdade : faculdadeService.buscarTodasFaculdades()) {
				log.info(faculdade.toString());
				log.info("");
			}

			log.info("-----------------------------------------------------------");
			log.info("-------------------------DELETE----------------------------");
			log.info("-----------------DELETANDO CURSO POR NOME------------------");
			Integer armazenarRetornoDeleteCurso = cursoService.apagarCursoPorDescricao("Matematica");
			log.info("Quantidade de itens apagados: " + armazenarRetornoDeleteCurso.toString());
			log.info("");

			log.info("-----------------DELETANDO CURSO POR DISCIPLINA------------");
			Integer armazenarRetornoDeleteDisciplina = disciplinaService.apagarDisciplinaPorDescricao("Libras");
			log.info("Quantidade de itens apagados: " + armazenarRetornoDeleteDisciplina.toString());
			log.info("");

			log.info("-----------------DELETANDO CURSO POR FACULDADE--------------");
			Integer armazenarRetornoDeleteFaculdade = faculdadeService.apagarFaculdadePorRazaoSocial("UTFPR");
			log.info("Quantidade de itens apagados: " + armazenarRetornoDeleteFaculdade.toString());
			log.info("");

			log.info("-----------------------------------------------------------");
			log.info("-------------------------UPDATE----------------------------");
			log.info("-----------------TROCANDO CURSO DE FACULDADE---------------");
			/*
			 * Primeiro parametro codigo da faculdade Segundo parametro descricao do curso
			 */
			Integer armazenarRetornoUpdateCurso = cursoService.alterarCursoDeFaculdade(4, "Lingua Portuguesa");
			log.info("Quantidade de itens atualizados: " + armazenarRetornoUpdateCurso.toString());
			log.info("");

			log.info("-----------------TROCANDO DISCIPLINA DE CURSO--------------");
			/*
			 * Primeiro parametro codigo do curso Segundo parametro descricao da disciplina
			 */
			Integer armazenarRetornoUpdateDisciplina = disciplinaService.alterarDisciplinaDeCurso(4, "Calculo avaçado");
			log.info("Quantidade de itens atualizados: " + armazenarRetornoUpdateDisciplina.toString());
			log.info("");

			log.info("-----------------TROCANDO RAZAO SOCIAL DA FACULDADE---------");
			/*
			 * Primeiro parametro codigo do curso Segundo parametro descricao da disciplina
			 */
			Integer armazenarRetornoUpdateFaculdade = faculdadeService
					.alterarRazaoSocialFaculdade("Univerdade Paranaense", "Unipar");
			log.info("Quantidade de itens atualizados: " + armazenarRetornoUpdateFaculdade.toString());
			log.info("");

			log.info("FIMMMMMMM");

		};
	}
}
