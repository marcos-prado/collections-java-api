package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);

            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    /**
     * 
     */
    public void obterDescricaoTarefas() {
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }

        public static void main(String[] args) {
            ListaTarefas lista = new ListaTarefas();
            lista.adicionarTarefa("Estudar Java");
            lista.adicionarTarefa("Fazer compras");
            lista.adicionarTarefa("Lavar o carro");
            lista.adicionarTarefa("Levar dog para passear");

            System.out.println("Número total de tarefas: " + lista.obterNumeroTotalTarefas());

            System.out.println("Descrição das tarefas:");
            lista.obterDescricaoTarefas();

            lista.removerTarefa("Fazer compras");
            lista.removerTarefa("Estudar Java");
            System.out.println("Descrição das tarefas após remoção:");

            System.out.println("Número total de tarefas após remoção: " + lista.obterNumeroTotalTarefas());
        }
    }

