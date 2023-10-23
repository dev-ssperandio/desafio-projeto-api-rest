package me.dio.desafioprojetoapirest.controller;

import me.dio.desafioprojetoapirest.domain.model.DoadorOrgao;
import me.dio.desafioprojetoapirest.service.DoadorOrgaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doadoresorgao")
public class DoadorOrgaoController {
    private final DoadorOrgaoService doadorOrgaoService;

    @Autowired
    public DoadorOrgaoController(DoadorOrgaoService doadorOrgaoService) {
        this.doadorOrgaoService = doadorOrgaoService;
    }

    @GetMapping
    public List<DoadorOrgao> listarDoadoresOrgao() {
        return doadorOrgaoService.listarDoadoresOrgao();
    }

    @GetMapping("/{id}")
    public DoadorOrgao buscarDoadorOrgaoPorId(@PathVariable Long id) {
        return doadorOrgaoService.buscarDoadorOrgaoPorId(id);
    }

    @PostMapping
    public DoadorOrgao criarDoadorOrgao(@RequestBody DoadorOrgao doadorOrgao) {
        return doadorOrgaoService.criarDoadorOrgao(doadorOrgao);
    }

    @DeleteMapping("/{id}")
    public void excluirDoadorOrgao(@PathVariable Long id) {
        doadorOrgaoService.excluirDoadorOrgao(id);
    }
}

