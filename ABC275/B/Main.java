package ABC275.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);
    //解答作成用
    public static void solve() throws IOException{
        // io
        String[] array = IO.input_b_array();
        BigInteger a = BigInteger.valueOf(Long.parseLong(array[0]));
        BigInteger b = BigInteger.valueOf(Long.parseLong(array[1]));
        BigInteger c = BigInteger.valueOf(Long.parseLong(array[2]));
        BigInteger d = BigInteger.valueOf(Long.parseLong(array[3]));
        BigInteger e = BigInteger.valueOf(Long.parseLong(array[4]));
        BigInteger f = BigInteger.valueOf(Long.parseLong(array[5]));

        BigInteger ans1 = (a.multiply(b.multiply(c)));
        BigInteger ans2 = (d.multiply(e.multiply(f)));
        // System.out.println(ans1.toString());
        // System.out.println(ans2.toString());
        BigInteger result = ans1.subtract(ans2);
        BigInteger m = BigInteger.valueOf(998244353L);
        result = result.remainder(m);
        System.out.println(result.toString());
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