package com.djonata.sistemaAcademico;

import java.time.LocalDateTime;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.djonata.sistemaAcademico.entity.Curso;
import com.djonata.sistemaAcademico.entity.Disciplina;
import com.djonata.sistemaAcademico.entity.Faculdade;
import com.djonata.sistemaAcademico.repository.CursoRepository;
import com.djonata.sistemaAcademico.repository.DisciplinaRepository;
import com.djonata.sistemaAcademico.repository.FaculdadeRepository;

@Component
@Transactional
public class InseridosDadosIniciais implements CommandLineRunner {

	@Autowired
	private FaculdadeRepository faculdadeRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Inserindo dados do banco referente a tabela faculdade
		 */
		Faculdade f1 = new Faculdade();
		Faculdade f2 = new Faculdade();
		f1.setRazaoSocial("Unopar");
		f2.setRazaoSocial("Anhanguera");
		faculdadeRepository.save(f1);
		faculdadeRepository.save(f2);

		/*
		 * Inserindo dados do banco referente a tabela curso
		 */
		Curso c1 = new Curso();
		c1.setDescricao("Ciência da computação");
		c1.setUsuario("Fernando");
		c1.setDataCadastro(LocalDateTime.now());
		c1.setDataAlteracao(LocalDateTime.now());
		c1.setFaculdade(f1);
		cursoRepository.save(c1);
		Curso c2 = new Curso();
		c2.setDescricao("Engenharia da computação");
		c2.setUsuario("Camila");
		c2.setDataCadastro(LocalDateTime.now());
		c2.setDataAlteracao(LocalDateTime.now());
		c2.setFaculdade(f2);
		cursoRepository.save(c2);

		/*
		 * Inserindo dados do banco referente a tabela disciplina
		 */
		Disciplina d1 = new Disciplina();
		d1.setDescricao("Programação Orientado a Objetos");
		d1.setCargHorariaTotal(80);
		d1.setCargHorariaPratica(40);
		d1.setCargHorariaTeorica(40);
		d1.setQtAlunos(75);
		d1.setUsuario("Rogerio");
		d1.setDataAlteracao(LocalDateTime.now());
		d1.setDataCadastro(LocalDateTime.now());
		d1.setCurso(c1);
		disciplinaRepository.save(d1);
		Disciplina d2 = new Disciplina();
		d2.setDescricao("Banco de dados");
		d2.setCargHorariaTotal(90);
		d2.setCargHorariaPratica(40);
		d2.setCargHorariaTeorica(40);
		d2.setQtAlunos(53);
		d2.setUsuario("Paulo");
		d2.setDataAlteracao(LocalDateTime.now());
		d2.setDataCadastro(LocalDateTime.now());
		d2.setCurso(c2);
		disciplinaRepository.save(d2);

	}

}
