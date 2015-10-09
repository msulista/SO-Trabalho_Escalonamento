/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcus.rodrigues
 */
public class prioridade {
    
    private List<Processo> processos;
    private int contador;
    private int acumulador;

    public prioridade() {
        this.processos = new ArrayList<>();
        this.contador = processos.size();
        
        this.processos.add(new Processo("processo 2", 2));
        this.processos.add(new Processo("processo 4", 4));
        this.processos.add(new Processo("processo 1", 1));
    }
    
    public String executaProcessosPorPrioridade(){
        
        while (contador > 0) {
            for (Processo processo : processos) {
            
            }
        }
        return "";
        
    }
    
    public int verificaAMaiorPrioridade(){
        for(int i = 0; i > processos.size() ; i++){
           
                if(processos.get(i).getPrioridade() > acumulador){
                    acumulador = processos.get(i).getPrioridade();
                }
        }
        return acumulador;
    }
}
