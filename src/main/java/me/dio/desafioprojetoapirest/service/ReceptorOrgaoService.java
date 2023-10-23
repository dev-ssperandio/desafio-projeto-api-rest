package me.dio.desafioprojetoapirest.service;

import me.dio.desafioprojetoapirest.domain.model.ReceptorOrgao;
import me.dio.desafioprojetoapirest.domain.repository.ReceptorOrgaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptorOrgaoService {
    private final ReceptorOrgaoRepository receptorOrgaoRepository;

    @Autowired
    public ReceptorOrgaoService(ReceptorOrgaoRepository receptorOrgaoRepository) {
        this.receptorOrgaoRepository = receptorOrgaoRepository;
    }

    public List<ReceptorOrgao> listarReceptoresOrgao() {
        return receptorOrgaoRepository.findAll();
    }

    public ReceptorOrgao criarReceptorOrgao(ReceptorOrgao receptorOrgao) {
        return receptorOrgaoRepository.save(receptorOrgao);
    }

    public ReceptorOrgao buscarReceptorOrgaoPorId(Long id) {
        return receptorOrgaoRepository.findById(id).orElse(null);
    }

    public void excluirReceptorOrgao(Long id) {
        receptorOrgaoRepository.deleteById(id);
    }
}

