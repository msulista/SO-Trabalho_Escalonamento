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
    private int tempoEspera = 0;
    

    public Prioridade() {
       
    }
    
    public String executaProcessosPorPrioridade(List<Processo> processos){        
        
        int tamanhoFila = processos.size();
        
        for (int i = 0; i < tamanhoFila; i++) {
            //System.out.println("Executando processo com prioridade " + maiorPrioridade(processos));
            Processo proc = processoComMaiorPrioridade(processos);
            System.out.println("Executando processo com prioridade: " + proc.getNome() );
            System.out.println("Prioridade: " + proc.getPrioridade());
            System.out.println("Tempo Execução: " + proc.getTempoExe());
            System.out.println("Tempo de espera: " + tempoEspera);
            System.out.println("");
            tempoEspera += proc.getTempoExe();
            removeProcesso(processos, proc.getId());
        }
        System.out.println("Tempo médio de espera: " + tempoEspera/tamanhoFila);
        System.err.println("\n\n");
        return "\nFim do Algoritimo de execução por Prioridade.\n\n";
    }    
 
    public Processo processoComMaiorPrioridade(List<Processo> processos){
        int maiorPrioridade = 0;
        int indice = 666;
        
        for (int i = 0; i < processos.size(); i++) {
            
            if(maiorPrioridade < processos.get(i).getPrioridade()){
                maiorPrioridade = processos.get(i).getPrioridade();                
                indice = i;
            }            
        }    
        processos.get(indice).setId(indice);
        return processos.get(indice);
    }    
    public void removeProcesso(List<Processo> processos, int i){
        processos.remove(i);
    }
}
