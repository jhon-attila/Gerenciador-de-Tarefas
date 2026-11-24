package tarefas.test;

import tarefas.service.Gerenciador;

public class CriandoTarefaTest01 {
    static void main(String[] args) {
        Gerenciador func = new Gerenciador();
        String sair;

        do {
            System.out.println("----------Lista de Tarefas---------------");
            func.listarTarefas();

            System.out.println("Opções: ");
            func.listarFuncoes();

            sair = func.finalizar();

        } while (sair.equalsIgnoreCase("N"));

    }
}
