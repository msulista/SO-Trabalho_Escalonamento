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

    private String nome;
    private int tempoExe;
    private int prioridade;
    private int id;

    public Processo() {
    }

    public Processo(String nome, int tempoExe) {
        this.nome = nome;
        this.tempoExe = tempoExe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoExe() {
        return tempoExe;
    }

    public void setTempoExe(int tempoExe) {
        this.tempoExe = tempoExe;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Tempo Execucao:" + tempoExe;
    }
}