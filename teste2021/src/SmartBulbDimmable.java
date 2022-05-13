import java.util.function.Consumer;

public class SmartBulbDimmable extends SmartBulb{

    double intensidade;

    public SmartBulbDimmable(String id, double consumoPorHora) {
        super(id, consumoPorHora);
        setConsumoPorHora(consumoPorHora/2);
    }

    public static Consumer<SmartBulbDimmable> vinte5(){
        return sb -> {
            sb.setConsumoPorHora(sb.getConsumoPorHora() / 0.25);
        };
    }

    public void alteraInfo(Consumer<SmartBulbDimmable> bd){
        bd.accept(this);
    }
}
