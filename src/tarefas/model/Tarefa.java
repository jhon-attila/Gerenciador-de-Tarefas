package tarefas.model;
import java.util.ArrayList;

public class Tarefa {
    private String titulo;
    private String descricao;
    private EstadoTarefa estado;
    ArrayList<Tarefa> tarefas = new ArrayList<>();


    public Tarefa(String titulo, String descicao) {
        this.titulo = titulo;
        this.descricao = descicao;
        this.estado = estado.PENDENTE;
    }
    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descricao;
    }

    public void setDescicao(String descicao) {
        this.descricao = descicao;
    }

    public EstadoTarefa getEstado() {
        return estado;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estado=" + estado;
    }
}
