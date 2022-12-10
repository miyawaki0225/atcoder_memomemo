package math_and_algorithm_a.c002;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);

    // memo
    public static Map<Long, Long> map = new HashMap<>();

    // 解答作成用
    public static void solve() throws IOException {
        // io
        int n = Convert.str2int(IO.input_string());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i != 0 && j == 0) {
                    matrix[i][0] = 1;
                    System.out.printf(matrix[i][0] + " ");
                }
                if (i == j) {
                    matrix[i][j] = 1;
                    System.out.println(matrix[i][j]);
                    break;
                }
                if(i != 0 && j !=0){
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                    System.out.printf(matrix[i][0] + " ");
                }
                System.out.printf(matrix[i][0] + " ");
            }
        }
    //     String result = "No";
    //     System.out.println(result);
    }

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
        public static int str2int(String str) {
            return Integer.parseInt(str);
        }

        public static int[] str2int(String[] str_array) {
            return Arrays.stream(str_array).mapToInt(Integer::parseInt).toArray();
        }
    }
}