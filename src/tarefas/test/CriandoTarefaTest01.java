package tarefas.test;

import tarefas.service.Criacao;

public class CriandoTarefaTest01 {
    static void main(String[] args) {
        Criacao criacao = new Criacao();
        criacao.criarTarefa("Estudar", "Estudar java");
        criacao.criarTarefa("treinar", "treinar peito");
    }
}
