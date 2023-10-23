package me.dio.desafioprojetoapirest.domain.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class DoacaoOrgao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DoacaoOrgao doador;

    @ManyToOne
    private Orgao orgao;
    
    private LocalDate dataDoacao;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public DoacaoOrgao getDoador() {
        return doador;
    }
    public void setDoador(DoacaoOrgao doador) {
        this.doador = doador;
    }
    public Orgao getOrgao() {
        return orgao;
    }
    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }
    public LocalDate getDataDoacao() {
        return dataDoacao;
    }
    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    
}