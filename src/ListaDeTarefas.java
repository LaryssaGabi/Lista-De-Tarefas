import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefas> tarefas;
    private int ordem; // Campo para rastrear a ordem

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
        ordem = 1; // Inicializa a ordem
    }
    
    public void adicionarTarefa(Tarefas tarefa) {
        tarefa.setOrdem(ordem); // Define a ordem da tarefa
        tarefas.add(tarefa);
        ordem++; // Incrementa a ordem para a próxima tarefa
    }

    public int getOrdem() {
        return ordem;
    }
    
    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefas tarefa = tarefas.get(indice);
            tarefa.setConcluida(true);
        }
    }

    public void desmarcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefas tarefa = tarefas.get(indice);
            tarefa.setConcluida(false);
        }
    }

    public List<Tarefas> listarTarefasPendentes() {
        List<Tarefas> tarefasPendentes = new ArrayList<>();
        for (Tarefas tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public List<Tarefas> listarTodasAsTarefas() {
        return tarefas;
    }

    public boolean definirDataDeVencimento(int indice, Date dataDeVencimento) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefas tarefa = tarefas.get(indice);
            tarefa.setDataDeVencimento(dataDeVencimento);
            return true;
        }
        return false;
    }

    
}
