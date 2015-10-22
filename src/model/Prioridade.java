/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author marcus.rodrigues
 */
public class Prioridade {
    
    private int cont;
    private int maior;
    private int numero;
    private int tempoEspera;
    

    public Prioridade() {
       
    }
    
    public String executaProcessosPorPrioridade(List<Processo> processos){        
        
        int tamanhoFila = processos.size();
        
        for (int i = 0; i < tamanhoFila; i++) {
            System.out.println("Executando processo com prioridade " + maiorPrioridade(processos));
        }
        return "\nFim do Algoritimo de execução por Prioridade.\n\n";
    }
    
    public int maiorPrioridade(List<Processo> processos){
        int maiorPrioridade = 0;
        int indice = 666;
        
        for (int i = 0; i < processos.size(); i++) {
            
            if(maiorPrioridade < processos.get(i).getPrioridade()){
                maiorPrioridade = processos.get(i).getPrioridade();
                tempoEspera = tempoEspera + processos.get(i).getTempoExe();
                indice = i;
            }            
        }
        processos.remove(indice);
        return maiorPrioridade;
    }
}
