import java.util.Date;

public class Tarefas {
    private String nome;
    private String descricao;
    private int duracao;
    private boolean concluida; // verdadeiro = concluido | falso = pendente
    private Date dataDeVencimento;
    private int ordem;

    public Tarefas(String nome, String descricao, int duracao, boolean concluida, Date dataDeVencimento, int ordem) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.concluida = concluida;
        this.dataDeVencimento = dataDeVencimento;
        this.ordem = ordem;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }
    
    public int getOrdem() {
        return ordem;
    }
    

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

     public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
   

    @Override
    public String toString() {
        return "Nome: " + nome + ", Descrição: " + descricao + ", Concluída: " + (concluida ? "Sim" : "Não") + ", Data de Vencimento: " + dataDeVencimento;
    }

   

}
