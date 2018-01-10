/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.spam.modelo.negocio;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ester
 */
@Entity
public class Publicacao {
    
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String titulo;
    @Column
    private String mensagem;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn
    private Disciplina disciplina;
    @OneToMany (cascade = CascadeType.ALL)
    private Set<Resposta> respostas;
    
    public Publicacao(){
        
    }
    
    public Publicacao(long id, String titulo, String mensagem, Disciplina disciplina, Set<Resposta> respostas){
        this.id=id;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.disciplina = disciplina;
        this.respostas=respostas;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Set<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(Set<Resposta> respostas) {
        this.respostas = respostas;
    }
    
    
}
