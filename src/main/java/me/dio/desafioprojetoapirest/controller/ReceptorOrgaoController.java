package me.dio.desafioprojetoapirest.controller;

import me.dio.desafioprojetoapirest.domain.model.ReceptorOrgao;
import me.dio.desafioprojetoapirest.service.ReceptorOrgaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receptoresorgao")
public class ReceptorOrgaoController {
    private final ReceptorOrgaoService receptorOrgaoService;

    @Autowired
    public ReceptorOrgaoController(ReceptorOrgaoService receptorOrgaoService) {
        this.receptorOrgaoService = receptorOrgaoService;
    }

    @GetMapping
    public List<ReceptorOrgao> listarReceptoresOrgao() {
        return receptorOrgaoService.listarReceptoresOrgao();
    }

    @GetMapping("/{id}")
    public ReceptorOrgao buscarReceptorOrgaoPorId(@PathVariable Long id) {
        return receptorOrgaoService.buscarReceptorOrgaoPorId(id);
    }

    @PostMapping
    public ReceptorOrgao criarReceptorOrgao(@RequestBody ReceptorOrgao receptorOrgao) {
        return receptorOrgaoService.criarReceptorOrgao(receptorOrgao);
    }

    @DeleteMapping("/{id}")
    public void excluirReceptorOrgao(@PathVariable Long id) {
        receptorOrgaoService.excluirReceptorOrgao(id);
    }
}

