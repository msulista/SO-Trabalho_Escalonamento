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
    private int cont;
    private int maior;
    private int numero;
    

    public prioridade() {
        this.processos = new ArrayList<>();
        this.contador = processos.size();
        
        this.processos.add(new Processo("processo 2", 2));
        this.processos.add(new Processo("processo 4", 4));
        this.processos.add(new Processo("processo 1", 1));
    }
    
    public String executaProcessosPorPrioridade(){        
        while (processos.size() > 0) {            
            
        }
        return "";
    }
    
    public int maiorProcesso(){
        this.maior = processos.get(0).getPrioridade();
        numero = maior;
        int cont = 0;
        while (numero > maior) {   
            cont++;
            numero = processos.get(cont).getPrioridade();
            maior = numero;
        }
    }
}
