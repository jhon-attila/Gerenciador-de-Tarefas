package tarefas.service;


import tarefas.model.Tarefa;

public class Criacao {

    public Tarefa criarTarefa(String titulo, String desc){
        Tarefa tarefa = new Tarefa(titulo, desc);
        tarefa.adicionar(tarefa);
        System.out.println(tarefa.getTarefas());
        return tarefa;
    }

}
