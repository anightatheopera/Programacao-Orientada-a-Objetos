import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ficha2 f = new Ficha2();
        // exercicio 1
        int[] teste = {10,2,3,4,5,6,7};
        int[] teste2 = {2,7,4,1,9,0};
        //ex 1a
        //System.out.println(f.exercicio1a(teste));
        //ex 1b
        //System.out.println(Arrays.toString(f.exercicio1b(teste,2,4)));
        //ex 1c
        //System.out.println(Arrays.toString(f.exercicio1c(teste,teste2)));
        // exercicio 2
        //ex 2a
        //int[][] ex = new int[5][5];
        //ex = f.exercicio2a(ex);
        //f.print2D(ex);
        int[][] notasTurma = {{12, 11, 15, 16, 17},
                              {16, 15, 17, 18, 20},
                              {11, 10, 11, 10, 11},
                              {20, 11, 18, 19, 12},
                              {14, 15, 16, 16, 18}
                             };
        //ex 2b
        //System.out.println(f.exercicio2b(notasTurma));
        //ex 2c
        //System.out.println(f.exercicio2c(notasTurma));
        //ex 2d
        //System.out.println(f.exercicio2d(notasTurma));
        //ex 2e
        //System.out.println(Arrays.toString(f.exercicio2e(notasTurma)));
        //ex 2f
        //System.out.println(Arrays.toString(f.exercicio2f(notasTurma)));
        //ex 2g
        //System.out.println(Arrays.toString(f.exercicio2g(notasTurma,9)));
        //exercicio 3
        LocalDateClass l = new LocalDateClass();
        LocalDate agora = LocalDate.now();
        l.insereData(LocalDate.of(2014, 8, 1));
        l.insereData(LocalDate.of(2013, 2, 4));
        l.insereData(LocalDate.of(2011, 9, 17));
        System.out.println(l.dataMaisProxima(agora));


    }
}
