package DoubleShort;
import java.util.Arrays;
import java.util.Random;

public class DoubleShort {

    public static void main(String[] args) {
        int nt = 5;
        int[] vetor = new int[nt];
        Random rand = new Random();

        for(int i = 0; i < nt; i++){
            vetor[i] = rand.nextInt(101);
        }

        int flag = 1;
        int tv = vetor.length;
        while (flag != 0){
            flag = 0;
            for (int i = 0; i < tv - 1; i++) {
                if(vetor[i] > vetor[i+1]){
                    int bkp=vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = bkp;
                    flag = 1;
                    System.out.println(Arrays.toString(vetor));
                }
            }
        }
        System.out.println("=============================================================");
        System.out.println("Programa feito para organizar vetor pelo método Double Sort!");
        System.out.println("=============================================================");
    }
}