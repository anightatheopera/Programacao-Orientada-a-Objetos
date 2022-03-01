import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Exercicios1 {
    public double celsiusParaFarenheit(double graus){
        double res = graus * 1.8 + 32;
        return res;
    }

    public int maximoNumero(int a, int b){
        if(a>b) return a;
        else return b;
    }

    public String criaDescricaoConta(String nome, double saldo) {
        String result = "Nome: " + nome + "\n" + "Saldo: " + saldo + " (euros).";
        return result;
    }

    public double eurosParaLibras(double valor, double taxaConv){
        return valor * taxaConv;
    }

    public String mediaEOrdem(int a, int b){
        double avg = (a+b)/2;
        if(a>b) return a + "\n" + b + "\n" + "media: " + avg;
        else return b + "\n" + a + "\n" + "media: " + avg;
    }

    public long fatorial(int num) {
        long fat = 1;
        for (long i = 1; i <= num; i++) fat *= i;
        return fat;
    }

    public long tempoGasto() {
        long time_start = System.currentTimeMillis();
        fatorial(5000);
        long time_end = System.currentTimeMillis();
        long ciclo = time_end - time_start;
        System.out.println("tempo de execução: " + ciclo);
        return ciclo;
    }
}
