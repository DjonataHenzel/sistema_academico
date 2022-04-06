package com.djonata.sistemaAcademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.djonata.sistemaAcademico.entity.Faculdade;
import com.djonata.sistemaAcademico.repository.FaculdadeRepository;

@Service
public class FaculdadeService {

	@Autowired
	private FaculdadeRepository faculdadeRepository;

	public List<Faculdade> buscarTodasFaculdades() {
		return faculdadeRepository.findAll();
	}

	public int apagarFaculdadePorRazaoSocial(String razaoSocial) {
		return faculdadeRepository.removerFaculdadePorRazaoSocial(razaoSocial);
	}

	public int alterarRazaoSocialFaculdade(String razaoSocialNova, String razaoSocialAntiga) {
		return faculdadeRepository.alterandoRazaoSocial(razaoSocialNova, razaoSocialAntiga);
	}
}
