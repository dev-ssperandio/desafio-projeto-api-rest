package me.dio.desafioprojetoapirest.domain.model;

import jakarta.persistence.*;

@Entity
public class DoadorOrgao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDoador;
    private String tipoSanguineo;
    private String informacaoContato;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeDoador() {
        return nomeDoador;
    }
    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }
    public String getTipoOrgao() {
        return tipoSanguineo;
    }
    public void setTipoOrgao(String tipoOrgao) {
        this.tipoSanguineo = tipoOrgao;
    }
    public String getInformacaoContato() {
        return informacaoContato;
    }
    public void setInformacaoContato(String informacaoContato) {
        this.informacaoContato = informacaoContato;
    }

    
}
