/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpe.garanhuns.spam.builders;

import br.ifpe.garanhuns.spam.modelo.negocio.Horario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ester
 */
@ManagedBean
@RequestScoped
public class BuilderHorario {
    
    private long id;
    private String dia;
    private String hora;
    
    public BuilderHorario(){
        
    }
    
    public Horario construirHorario(){
        return new Horario(id, dia, hora);
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
