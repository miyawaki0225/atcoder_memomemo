package ABC271.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int[] nq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // Lの幅は不定
        int[][] l_matrix = new int[nq[0]][];

        // Sの幅は2
        int[][] s_matrix = new int[nq[1]][2];
        for(int i=0;i<nq[0];i++){
            l_matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        // L S
        for(int i=0;i<nq[1];i++){
            s_matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int[] array:s_matrix){
            System.out.println(l_matrix[array[0]-1][array[1]]);
        }
    }
}