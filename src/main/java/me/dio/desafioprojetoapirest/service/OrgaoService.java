package me.dio.desafioprojetoapirest.service;

import me.dio.desafioprojetoapirest.domain.model.Orgao;
import me.dio.desafioprojetoapirest.domain.repository.OrgaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgaoService {
    private final OrgaoRepository orgaoRepository;

    @Autowired
    public OrgaoService(OrgaoRepository orgaoRepository) {
        this.orgaoRepository = orgaoRepository;
    }

    public List<Orgao> listarOrgaos() {
        return orgaoRepository.findAll();
    }

    public Orgao criarOrgao(Orgao orgao) {
        return orgaoRepository.save(orgao);
    }

    public Orgao buscarOrgaoPorId(Long id) {
        return orgaoRepository.findById(id).orElse(null);
    }

    public void excluirOrgao(Long id) {
        orgaoRepository.deleteById(id);
    }
}

