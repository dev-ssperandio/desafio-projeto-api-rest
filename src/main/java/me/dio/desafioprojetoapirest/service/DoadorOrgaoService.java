package me.dio.desafioprojetoapirest.service;

import me.dio.desafioprojetoapirest.domain.model.DoadorOrgao;
import me.dio.desafioprojetoapirest.domain.repository.DoadorOrgaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoadorOrgaoService {
    private final DoadorOrgaoRepository doadorOrgaoRepository;

    @Autowired
    public DoadorOrgaoService(DoadorOrgaoRepository doadorOrgaoRepository) {
        this.doadorOrgaoRepository = doadorOrgaoRepository;
    }

    public List<DoadorOrgao> listarDoadoresOrgao() {
        return doadorOrgaoRepository.findAll();
    }

    public DoadorOrgao criarDoadorOrgao(DoadorOrgao doadorOrgao) {
        return doadorOrgaoRepository.save(doadorOrgao);
    }

    public DoadorOrgao buscarDoadorOrgaoPorId(Long id) {
        return doadorOrgaoRepository.findById(id).orElse(null);
    }

    public void excluirDoadorOrgao(Long id) {
        doadorOrgaoRepository.deleteById(id);
    }
}
