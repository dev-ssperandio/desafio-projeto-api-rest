package me.dio.desafioprojetoapirest.service;

import me.dio.desafioprojetoapirest.domain.model.DoacaoOrgao;
import me.dio.desafioprojetoapirest.domain.repository.DoacaoOrgaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoOrgaoService {
    private final DoacaoOrgaoRepository doacaoOrgaoRepository;

    @Autowired
    public DoacaoOrgaoService(DoacaoOrgaoRepository doacaoOrgaoRepository) {
        this.doacaoOrgaoRepository = doacaoOrgaoRepository;
    }

    public List<DoacaoOrgao> listarDoacoesOrgao() {
        return doacaoOrgaoRepository.findAll();
    }

    public DoacaoOrgao criarDoacaoOrgao(DoacaoOrgao doacaoOrgao) {
        return doacaoOrgaoRepository.save(doacaoOrgao);
    }

    public DoacaoOrgao buscarDoacaoOrgaoPorId(Long id) {
        return doacaoOrgaoRepository.findById(id).orElse(null);
    }

    public void excluirDoacaoOrgao(Long id) {
        doacaoOrgaoRepository.deleteById(id);
    }
}

