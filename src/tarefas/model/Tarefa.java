package tarefas.model;
import java.util.ArrayList;

public class Tarefa {
    private String titulo;
    private String descricao;
    private EstadoTarefa estado;


    public Tarefa(String titulo, String descicao) {
        this.titulo = titulo;
        this.descricao = descicao;
        this.estado = estado.PENDENTE;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descicao) {
        this.descricao = descicao;
    }

    public EstadoTarefa getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarefa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estado=" + estado;
    }
}
