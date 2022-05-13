import java.util.List;

public class Podcast {

    private String titulo;
    private double ratings;
    private String descricao;
    private List<Episodio> eps;

    public List<Episodio> getEps() {
        return eps;
    }

    public double getRatings() {
        return ratings;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }
}
