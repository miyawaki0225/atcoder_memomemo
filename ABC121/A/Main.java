package ABC121.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    // 解答作成用
    public static void solve() throws IOException {
        String[] HW = IO.input_b_array();
        String[] hw = IO.input_b_array();
        int[] i_HW = Convert.str2int(HW);
        int[] i_hw = Convert.str2int(hw);
        int result = 0;

        int area = i_HW[0] * i_HW[1];
        int black_area = i_hw[0] * i_HW[1] + i_hw[1] * i_HW[0] - i_hw[0] * i_hw[1];
        result = area - black_area;
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
