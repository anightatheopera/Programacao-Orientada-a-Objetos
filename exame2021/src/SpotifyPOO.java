import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpotifyPOO {

    private List<Podcast> podcasts;
    private List<Utilizador> users;

    public List<Episodio> getEpisodes (String nomePodcast){
        List<Episodio> ret = null;
        for(Podcast p : podcasts){
            if(p.getTitulo().equals(nomePodcast)){
                ret = p.getEps();
            }
        }
        return ret;
    }

    public void remove (String nomePodcast){
        for(Podcast p : podcasts){
            if(p.getTitulo().equals(nomePodcast)){
                podcasts.remove(p);
            }
        }
    }

    public Episodio getEpMaisLongo(String user){
        Episodio maior = null;
        double max = 0.0;
        for (Utilizador u : users){
            if(u.getUsername().equals(user)){
                for (Podcast p : u.getSubs()){
                    for(Episodio e : p.getEps()){
                        if(e.getDuracao() > max){
                            max = e.getDuracao();
                            maior = e;
                        }
                    }

                }
            }
        }
        return maior;
    }

    public Map<Integer,List<Episodio>> episodiosPorClassf(){
        Map<Integer,List<Episodio>> ret = new HashMap<>();
        for(Podcast p : podcasts){
            p.getEps()
                    .stream()
                    .map(x -> x.getClassificacao())
                    .collect(Collectors.toCollection())

        }
    }



}
