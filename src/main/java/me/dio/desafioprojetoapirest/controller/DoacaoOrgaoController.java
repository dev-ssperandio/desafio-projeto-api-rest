package me.dio.desafioprojetoapirest.controller;

import me.dio.desafioprojetoapirest.domain.model.DoacaoOrgao;
import me.dio.desafioprojetoapirest.service.DoacaoOrgaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doacoesorgao")
public class DoacaoOrgaoController {
    private final DoacaoOrgaoService doacaoOrgaoService;

    @Autowired
    public DoacaoOrgaoController(DoacaoOrgaoService doacaoOrgaoService) {
        this.doacaoOrgaoService = doacaoOrgaoService;
    }

    @GetMapping
    public List<DoacaoOrgao> listarDoacoesOrgao() {
        return doacaoOrgaoService.listarDoacoesOrgao();
    }

    @GetMapping("/{id}")
    public DoacaoOrgao buscarDoacaoOrgaoPorId(@PathVariable Long id) {
        return doacaoOrgaoService.buscarDoacaoOrgaoPorId(id);
    }

    @PostMapping
    public DoacaoOrgao criarDoacaoOrgao(@RequestBody DoacaoOrgao doacaoOrgao) {
        return doacaoOrgaoService.criarDoacaoOrgao(doacaoOrgao);
    }

    @DeleteMapping("/{id}")
    public void excluirDoacaoOrgao(@PathVariable Long id) {
        doacaoOrgaoService.excluirDoacaoOrgao(id);
    }
}

