package tarefas.service;

import tarefas.model.EstadoTarefa;
import tarefas.model.Tarefa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void listarFuncoes(){
        System.out.println("1- Criar tarefa");
        System.out.println("2- Editar tarefa");
        System.out.println("3- Deletar tarefa");
        System.out.println("4- filtrar pendentes");
        System.out.println("5- Sair");
        int escolha = input.nextInt();
        switch (escolha){
            case 1:
                criarTarefa();
                break;
            case 2:
                editarTarefa();
                break;
            case 3:
                deletarTarefa();
                break;
            case 4:
                filtrarTarefas();
                break;
            case 5:
                finalizar();
                break;
            default:
                System.out.println("Opção invalida");
        }
    }

    public void listarTarefas(){
        for(int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getEstado().equals(EstadoTarefa.CONCLUIDA)){
                System.out.println(i + " - "+tarefas.get(i).getTitulo()+" ✓");
            }else {
                System.out.println(i + " - "+tarefas.get(i).getTitulo());
            }
        }
    }

    public void criarTarefa() {
        System.out.println("Adcione um titulo a tarefa: ");
        String modT = input.nextLine();
        modT = input.nextLine();
        System.out.println("Adcione uma descrição a tarefa: ");
        String modDesc = input.nextLine();
        Tarefa tarefa = new Tarefa(modT, modDesc);
        tarefas.add(tarefa);

    }

    public void editarTarefa() {
        System.out.println("Escolha a tarefa que deseja editar: ");
        listarTarefas();
        int escolha = input.nextInt();

        if (tarefas.contains(tarefas.get(escolha))) {
            System.out.println("qual opção deseja editar(Status mudado automaticamente ao selecionar): ");
            System.out.println("1-Título: " + tarefas.get(escolha).getTitulo());
            System.out.println("2-Descrição: " + tarefas.get(escolha).getDescricao());
            System.out.println("3-Estado: " + tarefas.get(escolha).getEstado());
            int escolha2 = input.nextInt();

            switch (escolha2) {
                case 1:
                    System.out.println("escreva: ");
                    input.nextLine();
                    String mod = input.nextLine();
                    tarefas.get(escolha).setTitulo(mod);
                    System.out.println(tarefas.get(escolha));
                    break;
                case 2:
                    System.out.println("escreva: ");
                    input.nextLine();
                    String mod2 = input.nextLine();
                    tarefas.get(escolha).setDescricao(mod2);
                    System.out.println(tarefas.get(escolha));
                    break;
                case 3:
                    tarefas.get(escolha).setEstado(EstadoTarefa.CONCLUIDA);
                    System.out.println(tarefas.get(escolha));
                    break;
            }
        }
         else {
            System.out.println("Indice invalido");
        }
    }

    public void deletarTarefa(){
        listarTarefas();
        System.out.println("Qual tarefa deseja deletar: ");
        int escolha = input.nextInt();
        tarefas.remove(escolha);
        System.out.println("Elemento removido...");
    }

    public void filtrarTarefas(){
        for(int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getEstado().equals(EstadoTarefa.CONCLUIDA)){
                continue;
            }else {
                System.out.println(i + " - "+tarefas.get(i).getTitulo());
            }
        }
    }

    public String finalizar(){
        String sair = "N";
        System.out.println("Deseja encerrar aplicação(S/N): ");
        sair = input.nextLine();
        return sair;
    }

}