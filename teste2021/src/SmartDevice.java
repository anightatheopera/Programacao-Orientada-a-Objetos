import java.time.LocalDateTime;

public class SmartDevice {
    private String id;
    private boolean on;
    private double consumoPorHora;

    public SmartDevice(String id, double consumoPorHora) {
        this.id = id;
        this.on = false;
        this.consumoPorHora = consumoPorHora;
    }

    public void setConsumoPorHora(double consumoPorHora) {
        this.consumoPorHora = consumoPorHora;
    }

    public double getConsumoPorHora() {
        return this.consumoPorHora;
    }
}
