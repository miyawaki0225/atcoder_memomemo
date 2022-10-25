package ABC114.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    // 解答作成用
    public static void solve() throws IOException {
        String X = IO.input_string();
        String result = "NO";

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            result = "YES";
        }
        System.out.println(result);
    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solve();
        out.flush();
    }

    static class IO {
        public static String input_string() throws IOException {
            return br.readLine();
        }

        public static String[] input_n_array() throws IOException {
            return br.readLine().split("");
        }

        public static String[] input_b_array() throws IOException {
            return br.readLine().split(" ");
        }

        public static String[][] input_matrix(String[] str_array) throws IOException {
            int len = Convert.str2int(str_array[0]);
            String[][] matrix = new String[len][];
            for (int i = 0; i < len; i++) {
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
