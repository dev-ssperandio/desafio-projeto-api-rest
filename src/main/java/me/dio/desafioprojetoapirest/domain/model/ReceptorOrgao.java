package me.dio.desafioprojetoapirest.domain.model;

import jakarta.persistence.*;

@Entity
public class ReceptorOrgao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipoSangue;
    private String informacoesContato;
    
    @ManyToOne
    private DoadorOrgao doador;

    public DoadorOrgao getDoador() {
        return doador;
    }
    public void setDoador(DoadorOrgao doador) {
        this.doador = doador;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoSangue() {
        return tipoSangue;
    }
    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
    public String getInformacoesContato() {
        return informacoesContato;
    }
    public void setInformacoesContato(String informacoesContato) {
        this.informacoesContato = informacoesContato;
    }

    
}