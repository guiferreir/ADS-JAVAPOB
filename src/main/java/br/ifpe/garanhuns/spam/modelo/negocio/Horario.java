package br.ifpe.garanhuns.spam.modelo.negocio;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ester
 */
@Table
@Entity
public class Horario {
    @Column(name="id")
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String dia;
    @Column
    private Date hora;
    
    public Horario(){
        
    }

    public Horario(long id, String dia, Date hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }

    public long getId() {
        return id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
}