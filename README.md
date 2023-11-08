# Lista de Tarefas
<div align="center">
<img width="140" alt="image" src="https://github.com/LaryssaGabi/Lista-De-Tarefas/assets/111398446/a8a4a7dd-b5f8-4c16-b034-fa79eb2fb0aa"/>
</div>

# Sistema de Lista de Tarefas

O Sistema de Lista de Tarefas é um programa Java simples que permite aos usuários gerenciar suas tarefas, adicionando, marcando como concluídas, definindo datas de vencimento e removendo tarefas. Ele foi desenvolvido com o objetivo de facilitar o acompanhamento de tarefas diárias ou projetos pessoais.

## Conteúdo

1. [Instruções de Uso](#instruções-de-uso)
2. [Visão Geral do Código](#visão-geral-do-código)
3. [Classe Tarefas](#classe-tarefas)
4. [Classe ListaDeTarefas](#classe-listadetarefas)


## Instruções de Uso

O Sistema de Lista de Tarefas é executado via linha de comando e oferece as seguintes funcionalidades:

1. Adicionar Tarefa: Permite ao usuário adicionar uma nova tarefa com um nome, descrição e data de vencimento opcional.

2. Marcar Tarefa como Concluída: Marca uma tarefa existente como concluída, com base no índice fornecido.

3. Desmarcar Tarefa como Concluída: Remove a marcação de conclusão de uma tarefa.

4. Definir Data de Vencimento: Define uma data de vencimento para uma tarefa existente.

5. Remover Tarefa: Remove uma tarefa com base no índice fornecido.

6. Listar Tarefas Pendentes: Exibe a lista de todas as tarefas que ainda não foram marcadas como concluídas.

7. Listar Todas as Tarefas: Exibe a lista de todas as tarefas, incluindo as concluídas.

0. Sair: Encerra o programa.

Siga as instruções exibidas no console para utilizar o programa. Certifique-se de fornecer informações válidas e seguir o formato de data "dd/MM/yyyy" ao definir datas de vencimento.

## Visão Geral do Código

O código-fonte do Sistema de Lista de Tarefas é composto por três classes principais:

1. `Principal`: Esta classe contém o método `main` que controla a execução do programa. Ela interage com o usuário por meio do console e oferece opções para gerenciar tarefas.

2. `Tarefas`: A classe `Tarefas` representa uma tarefa individual e possui atributos como nome, descrição, duração, status de conclusão, data de vencimento e ordem. Ela também fornece métodos para acessar e modificar esses atributos.

3. `ListaDeTarefas`: A classe `ListaDeTarefas` gerencia uma lista de tarefas, permitindo a adição, remoção, marcação e desmarcação de tarefas. Ela também fornece métodos para listar tarefas pendentes e todas as tarefas.

## Classe Tarefas

A classe `Tarefas` é responsável por representar tarefas individuais. Ela possui os seguintes atributos:

- `nome`: O nome da tarefa.
- `descricao`: A descrição da tarefa.
- `duracao`: A duração da tarefa (não utilizado no programa atual).
- `concluida`: Um booleano que indica se a tarefa está concluída ou não.
- `dataDeVencimento`: A data de vencimento da tarefa (opcional).
- `ordem`: A ordem de criação da tarefa.

A classe `Tarefas` também oferece métodos getters e setters para acessar e modificar esses atributos, além de uma representação textual da tarefa no método `toString`.

## Classe ListaDeTarefas

A classe `ListaDeTarefas` é responsável por gerenciar uma lista de tarefas. Ela possui os seguintes métodos principais:

- `adicionarTarefa`: Adiciona uma nova tarefa à lista, atribuindo-lhe um número de ordem único.
- `removerTarefa`: Remove uma tarefa com base em seu índice na lista.
- `marcarComoConcluida`: Marca uma tarefa como concluída com base em seu índice.
- `desmarcarComoConcluida`: Remove a marcação de conclusão de uma tarefa com base em seu índice.
- `listarTarefasPendentes`: Retorna uma lista das tarefas que ainda não foram concluídas.
- `listarTodasAsTarefas`: Retorna uma lista de todas as tarefas, incluindo as concluídas.
- `definirDataDeVencimento`: Define a data de vencimento de uma tarefa existente com base em seu índice.

## Pré-requisitos
Java Development Kit (JDK) instalado em seu sistema.
Um ambiente de desenvolvimento Java, como o Eclipse ou o IntelliJ IDEA (opcional).

## Como Usar
Siga as instruções no terminal para interagir com suas tarefas. Use os números das opções para realizar ações, como adicionar, remover, marcar como concluída, desmarcar como concluída, definir datas de vencimento(não é orbigatorio) e listar tarefas.
