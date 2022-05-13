import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CasaInteligente {

    private Map<String, List<SmartDevice>> dND;

    public Iterator<SmartDevice> devicesPorConsumoCres(){
        return dND.values().stream().flatMap(List::stream)
                .sorted(Comparator.comparing(SmartDevice::getConsumoPorHora))
                .iterator();
    }

    public int somaLista(List<SmartDevice> lista){
        int ret = 0;
        for(SmartDevice d : lista){
            ret += d.getConsumoPorHora();
        }
        return ret;
    }

    public String divisaoMaisEco(){
        int min = 100000;
        String div = new String();
        for (Map.Entry<String, List<SmartDevice>> pair : dND.entrySet()) {
            if(somaLista(pair.getValue()) < min){
                min = somaLista(pair.getValue());
                div = pair.getKey();
            }
        }
        return div;
    }

    public boolean apenasNumaDivisao(){
        for (String div : dND.keySet()) {
            for(SmartDevice dev : dND.get(div)){
                for (Map.Entry<String, List<SmartDevice>> stringListEntry : dND.entrySet()) {
                    if(!stringListEntry.getKey().equals(div) && stringListEntry.getValue().contains(dev)){
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean gravaEmFichObjectos(String fich) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(fich);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Collection<SmartSpeaker> lista = new ArrayList<>();
        for (List<SmartDevice> value : dND.values()) {
            for (SmartDevice smartDevice : value) {
                if(smartDevice instanceof SmartSpeaker){
                    lista.add((SmartSpeaker) smartDevice);
                }
            }
        }
        oos.writeObject(lista);
        oos.flush();
        oos.close();
    }

}
