package ABC275.A;

import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);
    //解答作成用
    public static void solve() throws IOException{
        // io
        int n = Convert.str2int(IO.input_string());
        int[] array = Convert.str2int(IO.input_b_array());
        int chmax = Integer.MIN_VALUE;
        int counter = 0;
        for(int i=0;i<n;i++){
            chmax = Math.max(chmax,array[i]);
            if(chmax==array[i]){
                counter = i;
            }
        }
        int result =counter+1;
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        solve();
        out.flush();
    }
    
    static class IO {
        public static char input_char() throws IOException {
            Scanner sc = new Scanner(System.in);
            return sc.next().charAt(0);
        }
        public static String input_string() throws IOException {
            return br.readLine();
        }
        public static String[] input_n_array() throws IOException {
            return br.readLine().split("");
        }
        public static String[] input_b_array() throws IOException {
            return br.readLine().split(" ");
        }
        public static String[] input_c_array() throws IOException {
            return br.readLine().split("\\.");
        }
        public static String[][] input_matrix(int n) throws IOException{
            String[][] matrix = new String[n][];
            for(int i=0;i<n;i++){
                matrix[i]=input_b_array();
            }
            return matrix;
        }
        public static void output_array(String[] str_array){
            for(String str:str_array){
                out.printf(str + " ");
            }
            out.println();
        }
        public static void output_array(int[] int_array){
            for(int i:int_array){
                out.printf(i + " ");
            }
            out.println();
        }
    }
    static class Convert {
        public static int str2int(String str){
            return Integer.parseInt(str);
        }
        public static int[] str2int(String[] str_array){
            return Arrays.stream(str_array).mapToInt(Integer::parseInt).toArray();
        }
    }
}