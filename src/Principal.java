import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            ListaDeTarefas lista = new ListaDeTarefas();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (true) {
                System.out.println("=== Lista de Tarefas ===");
                System.out.println("1. Adicionar Tarefa");
                System.out.println("2. Marcar Tarefa como Concluída");
                System.out.println("3. Desmarcar Tarefa como Concluída");
                System.out.println("4. Definir Data de Vencimento");
                System.out.println("5. Remover Tarefa");
                System.out.println("6. Listar Tarefas Pendentes");
                System.out.println("7. Listar Todas as Tarefas");
                System.out.println("0. Sair");

                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                    System.out.print("Nome da tarefa: ");
                        String nomeTarefa = scanner.nextLine();
                        System.out.print("Descrição da tarefa: "); // Solicitar descrição
                        String descricaoTarefa = scanner.nextLine();
                        Tarefas novaTarefa = new Tarefas(nomeTarefa, descricaoTarefa, 0, false, null, lista.getOrdem());
                        lista.adicionarTarefa(novaTarefa);
                        System.out.println("Tarefa adicionada com sucesso!");
                        break;
                    case 2:
                        System.out.print("Informa a tarefa a ser marcada como concluída: ");
                        int indiceConcluir = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        lista.marcarComoConcluida(indiceConcluir);
                        System.out.println("Tarefa marcada como concluída.");
                        break;
                    case 3:
                        System.out.print("Informe a tarefa a ser desmarcada como concluída: ");
                        int indiceDesmarcar = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        lista.desmarcarComoConcluida(indiceDesmarcar);
                        System.out.println("Tarefa desmarcada como não concluída.");
                        break;
                    case 4:
                        System.out.print("Informa a tarefa para definir data de vencimento: ");
                        int indiceData = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        System.out.print("Data de vencimento (dd/MM/yyyy): ");
                        String dataVencimentoStr = scanner.nextLine();
                        try {
                            Date dataVencimento = dateFormat.parse(dataVencimentoStr);
                            if (lista.definirDataDeVencimento(indiceData, dataVencimento)) {
                                System.out.println("Data de vencimento definida com sucesso.");
                            } else {
                                System.out.println("Tarefa não encontrada.");
                            }
                        } catch (ParseException e) {
                            System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
                        }
                        break;
                    case 5:
                        System.out.print("Informe a tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        lista.removerTarefa(indiceRemover);
                        System.out.println("Tarefa removida com sucesso.");
                        break;
                    case 6:
                        List<Tarefas> tarefasPendentes = lista.listarTarefasPendentes();
                        System.out.println("Tarefas Pendentes:");
                        for (int i = 0; i < tarefasPendentes.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefasPendentes.get(i));
                        }
                        break;
                    case 7:
                        List<Tarefas> todasAsTarefas = lista.listarTodasAsTarefas();
                        System.out.println("Todas as Tarefas:");
                        for (int i = 0; i < todasAsTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + todasAsTarefas.get(i));
                        }
                        break;
                    case 0:
                        System.out.println("Saindo do aplicativo.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            }
        }
    }
}
