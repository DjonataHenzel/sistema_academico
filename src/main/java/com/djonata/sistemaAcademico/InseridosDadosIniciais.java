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
		// -----------------------INSERT-------------------------
		/*
		 * Inserindo dados do banco referente a tabela faculdade
		 */
		Faculdade f1 = new Faculdade();
		Faculdade f2 = new Faculdade();
		Faculdade f3 = new Faculdade();
		Faculdade f4 = new Faculdade();
		Faculdade f5 = new Faculdade();
		f1.setRazaoSocial("Unopar");
		f2.setRazaoSocial("Anhanguera");
		f3.setRazaoSocial("UTFPR");
		f4.setRazaoSocial("FAG");
		f5.setRazaoSocial("Unipar");
		faculdadeRepository.save(f1);
		faculdadeRepository.save(f2);
		faculdadeRepository.save(f3);
		faculdadeRepository.save(f4);
		faculdadeRepository.save(f5);

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
		Curso c3 = new Curso();
		c3.setDescricao("Matematica");
		c3.setUsuario("Galvao");
		c3.setDataCadastro(LocalDateTime.now());
		c3.setDataAlteracao(LocalDateTime.now());
		c3.setFaculdade(f2);
		cursoRepository.save(c3);
		Curso c4 = new Curso();
		c4.setDescricao("Lingua Portuguesa");
		c4.setUsuario("Imelia");
		c4.setDataCadastro(LocalDateTime.now());
		c4.setDataAlteracao(LocalDateTime.now());
		c4.setFaculdade(f2);
		cursoRepository.save(c4);

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
		Disciplina d3 = new Disciplina();
		d3.setDescricao("Libras");
		d3.setCargHorariaTotal(50);
		d3.setCargHorariaPratica(30);
		d3.setCargHorariaTeorica(20);
		d3.setQtAlunos(5);
		d3.setUsuario("Carmen");
		d3.setDataAlteracao(LocalDateTime.now());
		d3.setDataCadastro(LocalDateTime.now());
		d3.setCurso(c2);
		disciplinaRepository.save(d3);
		Disciplina d4 = new Disciplina();
		d4.setDescricao("Calculo avaçado");
		d4.setCargHorariaTotal(10);
		d4.setCargHorariaPratica(20);
		d4.setCargHorariaTeorica(60);
		d4.setQtAlunos(15);
		d4.setUsuario("Jose");
		d4.setDataAlteracao(LocalDateTime.now());
		d4.setDataCadastro(LocalDateTime.now());
		d4.setCurso(c2);
		disciplinaRepository.save(d4);
	}
}
