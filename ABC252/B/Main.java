package ABC252.B;

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
        int[] nk = Convert.str2int(IO.input_b_array());
        int[] food_array = Convert.str2int(IO.input_b_array());
        int[] hate_array = Convert.str2int(IO.input_b_array());

        int max_num = Integer.MIN_VALUE;
        for(int i:food_array){
            max_num = Math.max(max_num, i);
        }
        String result = "No";
        for(int i:hate_array){
            if(food_array[i-1]==max_num){
                result = "Yes";
                break;
            };
        }
        System.out.println(result);
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