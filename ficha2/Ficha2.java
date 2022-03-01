import java.util.Scanner;

public class Ficha2{
    public int exercicio1a(int[] arr){
        int min = Integer.MAX_VALUE ;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public int[] exercicio1b(int[] arr, int a, int b){
        if(a > arr.length || b < a) return new int[0];
        int[] ret = new int[b-a+1];
        if(b > arr.length) b = arr.length;
        System.arraycopy(arr, a, ret, 0, b - a + 1);
        return ret;
    }

    public int[] exercicio1c(int a[], int b[]){
        int[] temp = new int[Math.max(a.length, b.length)];
        int i = 0;
        for(int elem1 : a){
            for(int elem2 : b){
                if(elem1 == elem2){
                    temp[i++] = elem1;
                }
            }
        }
        int[] res = new int[i];
        System.arraycopy(temp,0,res,0,i);
        return res;
    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("\n");
        }
    }

    public int[][] exercicio2a(int[][] pauta){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Introduzir nota");
                int nota = scanner.nextInt();
                pauta[i][j] = nota;
            }
        }
        return pauta;
    }

    public int exercicio2b(int[][] pauta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzir id da uc (0 a 4): ");
        int id = scanner.nextInt();
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += pauta[i][id];
        }
        return total;
    }

    public int exercicio2c(int[][] pauta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzir id de estudante: ");
        int id = scanner.nextInt();
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += pauta[id][i];
        }
        return total/5;
    }

    public int exercicio2d(int[][] pauta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzir id de UC (0 a 4): ");
        int id = scanner.nextInt();
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += pauta[i][id];
        }
        return total/5;
    }

    public int[] exercicio2e(int[][] pauta){
        int[] res = new int[5];
        int max = 0;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (max < pauta[j][i]) max = pauta[j][i];
            }
            res[i] = max;
            max = 0;
        }
        return res;
    }

    public int[] exercicio2f(int[][] pauta){
        int[] res = new int[5];
        int min = 20;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (min > pauta[j][i]) min = pauta[j][i];
            }
            res[i] = min;
            min = 20;
        }
        return res;
    }

    public int[] exercicio2g(int[][] pauta, int nota){
        int[] temp = new int[25];
        int aux = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(pauta[i][j] > nota)
                    temp[aux++] = pauta[i][j];
            }
        }
        int[] res = new int[aux];
        System.arraycopy(temp,0,res,0,aux);
        return res;
    }


}
