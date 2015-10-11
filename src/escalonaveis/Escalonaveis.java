/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonaveis;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import model.Processador;
import model.Processo;
import model.Prioridade;

public class Escalonaveis {

    private static Scanner e = new Scanner(System.in);
// 1   quantidade de processos na fila dos “prontos”.
//     todos processos são inicialmente colocados na fila do processos “prontos”.
// 2   P1, P2, ..., Pn;
// 3   tempo de execução de cada processo (tempo de turnaround);
// 4   o tempo em que cada processo foi iniciado

//    (i) a seqüência de execução dos
//processos com seus tempos individuais;
//    (ii) os tempos de espera de 
//execução de cada processo; (iii) as médias dos tempos de espera de 
//execução.
    public static void main(String args[]) {
        
        int opcao = 666;
        while (opcao != 0) { 
            
            System.out.println("ALGORITMOS DE ESCALONAMENTO");
            System.out.println("1 - FIFO");
            System.out.println("2 - PRIORIDADE");   
            System.out.print("Escolha uma opção: ");
            opcao = e.nextInt();

            if(opcao == 1){
                
                System.out.println("ALGORITMO FIFO");
                System.out.println("Quantos processos deseja criar ?");
                int numProc = e.nextInt();

                Processador cpu = new Processador();
                cpu.setQtd(numProc);

                ArrayList<Processo> p = new ArrayList<>();
                for (int i = 0; i < cpu.getQtd(); i++) {
                    System.out.println("Digite o nome do processo");
                    String nomeProc = e.next();
                    System.out.println("Digite o Tempo de Execucao do Processo");
                    int timeProc = e.nextInt();
                    Processo proc = new Processo();
                    proc.setNome(nomeProc);
                    proc.setTempoExe(timeProc);
                    p.add(proc);
                }

                cpu.setProcessos(p);

                System.out.println("quantidade de processos na fila dos “prontos”: " + cpu.getProcessos().size());
                int timeLine = 0;
                for (int i = 0; i < cpu.getProcessos().size(); i++) {
                    System.out.println("");
                    System.out.println((i + 1) + "° Processo INICIADO");
                    System.out.println("Tempo de execução do " + (i + 1) + "° processo: " + cpu.getProcessos().get(i).getTempoExe());
                    if (i == 0) {
                        System.out.println("Tempo que começou a ser executado: " + timeLine);
                    } else {
                        System.out.println("Tempo que começou a ser executado: " + (timeLine += cpu.getProcessos().get(i - 1).getTempoExe()));
                    }
                    System.out.println("Processo EXECUTADO");
                }
                int tempoTotal = 0;
                for (int i = 0; i < cpu.getProcessos().size(); i++) {
                    tempoTotal += cpu.getProcessos().get(i).getTempoExe();
                }
                System.out.println("Média de tempo: " + (tempoTotal / (double)cpu.getProcessos().size()));
 //Prioridade           
            }else if(opcao == 2){
                
                Prioridade prioridade = new Prioridade();
                Processador cpu = new Processador();
                
                System.out.println("ALGORITMO DE PRIORIDADE");
                System.out.println("Quantos processos deseja criar ?");
                cpu.setQtd(e.nextInt());

                ArrayList<Processo> p = new ArrayList<>();
                for (int i = 0; i < cpu.getQtd(); i++) {
                    System.out.print("Digite o nome do processo: ");
                    String nomeProc = e.next();
                    System.out.print("Digite o Tempo de Execucao do Processo: ");
                    int timeProc = e.nextInt();
                    System.out.print("Digite a prioridade do Processo: ");
                    int prioridadeN = e.nextInt();
                    System.out.println("");
                    
                    Processo proc = new Processo();
                    proc.setNome(nomeProc);
                    proc.setTempoExe(timeProc);
                    proc.setPrioridade(prioridadeN);
                    p.add(proc);
                }
                
                cpu.setProcessos(p);
                System.out.println("Quantidade de processos na fila dos “prontos”: " + cpu.getProcessos().size());
                
                prioridade.executaProcessosPorPrioridade(p);

            }else
                System.out.println("Escolha um opção valida!!!");
        }
    }
}
