import java.time.LocalDateTime;
import java.util.List;

public class Episodio {
    private String nome;
    private double duracao;
    private int classificacao;
    private List<String> conteudo;
    private int numeroVezesTocada;
    private LocalDateTime ultimaVez;

    public int getClassificacao() {
        return classificacao;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getNumeroVezesTocada() {
        return numeroVezesTocada;
    }

    public List<String> getConteudo() {
        return conteudo;
    }

    public LocalDateTime getUltimaVez() {
        return ultimaVez;
    }

    public String getNome() {
        return nome;
    }
}
