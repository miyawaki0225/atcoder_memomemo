package ABC048.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);

    
    // 解答作成用
    public static void solve() throws IOException {
        // io
        long[] array = Convert.str2long(IO.input_b_array());
        long count = 0;
        for (long i = array[0]; i <= array[1]; i++) {
            if (i % array[2] == 0) {
                count++;
            }
        }
        long result = count;
        System.out.println(result);
    }
    
    
    public static void main(String[] args) throws IOException {
        solve();
        out.flush();
    }

    // メモ化再帰
    public static Map<Long, Long> map = new HashMap<>();
    public static long f(long k) {
        long ans = 0;
        if (k == 0) {
            return 1;
        }
        if (map.containsKey(k)) {
            return map.get(k);
        }
        ans = f((long) Math.floor(k / 2)) + f((long) Math.floor(k / 3));
        map.put(k, ans);
        return ans;
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

        public static String[][] input_matrix(int n) throws IOException {
            String[][] matrix = new String[n][];
            for (int i = 0; i < n; i++) {
                matrix[i] = input_b_array();
            }
            return matrix;
        }

        public static void output_array(String[] str_array) {
            for (String str : str_array) {
                out.printf(str + " ");
            }
            out.println();
        }

        public static void output_array(int[] int_array) {
            for (int i : int_array) {
                out.printf(i + " ");
            }
            out.println();
        }
    }

    static class Convert {
        // int型
        public static int str2int(String str) {
            return Integer.parseInt(str);
        }

        public static int[] str2int(String[] str_array) {
            return Arrays.stream(str_array).mapToInt(Integer::parseInt).toArray();
        }

        // long型
        public static long str2long(String str) {
            return Long.parseLong(str);
        }

        public static long[] str2long(String[] str_array) {
            return Arrays.stream(str_array).mapToLong(Long::parseLong).toArray();
        }
    }
}