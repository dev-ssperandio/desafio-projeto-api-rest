package me.dio.desafioprojetoapirest.controller;

import me.dio.desafioprojetoapirest.domain.model.Orgao;
import me.dio.desafioprojetoapirest.service.OrgaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgaos")
public class OrgaoController {
    private final OrgaoService orgaoService;

    @Autowired
    public OrgaoController(OrgaoService orgaoService) {
        this.orgaoService = orgaoService;
    }

    @GetMapping
    public List<Orgao> listarOrgaos() {
        return orgaoService.listarOrgaos();
    }

    @GetMapping("/{id}")
    public Orgao buscarOrgaoPorId(@PathVariable Long id) {
        return orgaoService.buscarOrgaoPorId(id);
    }

    @PostMapping
    public Orgao criarOrgao(@RequestBody Orgao orgao) {
        return orgaoService.criarOrgao(orgao);
    }

    @DeleteMapping("/{id}")
    public void excluirOrgao(@PathVariable Long id) {
        orgaoService.excluirOrgao(id);
    }
}

