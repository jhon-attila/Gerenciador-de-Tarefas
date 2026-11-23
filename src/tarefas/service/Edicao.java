package tarefas.service;

import tarefas.model.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Edicao {
    Scanner input = new Scanner(System.in);
    private ArrayList<Tarefa> tarefas;

        public Edicao(Tarefa tarefa){
            this.tarefas = tarefa.getTarefas();
        }
        public Tarefa editarTarefa(){
            System.out.println("Escolha a tarefa que deseja editar: ");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + " - "+tarefas.get(i).getTitulo());
            }
            int escolha = input.nextInt();
            if (escolha >= 0 && escolha < tarefas.size()){
                Tarefa tarefaEscolhida = tarefas.get(escolha);
                return tarefaEscolhida;
            }else{
                System.out.println("Indice invalido");
                return null;
            }
    }
}
