/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marcus.rodrigues
 */
public class Processo {
    
    private int prioridade;
    private int  tempoExecução;
    private String tipoProcesso;
    private int tamanho;
    private String nome;

    public Processo() {
    }

    public Processo(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Processo(int prioridade, int tempoExecução, String tipoProcesso, int tamanho) {
        this.prioridade = prioridade;
        this.tempoExecução = tempoExecução;
        this.tipoProcesso = tipoProcesso;
        this.tamanho = tamanho;
        
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempoExecução() {
        return tempoExecução;
    }

    public void setTempoExecução(int tempoExecução) {
        this.tempoExecução = tempoExecução;
    }

    public String getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
}
