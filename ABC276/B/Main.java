package ABC276.B;

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
        int[] nm_array = Convert.str2int(IO.input_b_array());

        int[][] mapping = new int[nm_array[1]][nm_array[0] + 1];
        int[] tmp_array = new int[nm_array[0]];

        for (int i = 0; i < nm_array[1]; i++) {
            tmp_array = Convert.str2int(IO.input_b_array());
            System.out.println(Arrays.toString(tmp_array));
            mapping[tmp_array[0]-1][tmp_array[1]+1]++;
            mapping[tmp_array[1]-1][tmp_array[0]+1]++;
            mapping[tmp_array[0]-1][0]++;
            mapping[tmp_array[1]-1][0]++;
        }

        // for (int[] array : mapping) {
        //     System.out.println(Arrays.toString(array));
        // }
        for (int i = 0; i < nm_array[0]; i++) {
            System.out.printf("%d", mapping[i][0]);
            if (mapping[i][0] != 0) {
                for (int j = 1; j < nm_array[0] + 1; j++) {
                    if (j == nm_array[0] + 1) {
                        break;
                    }else{
                        if (mapping[i][j] != 0){
                            System.out.printf(" %d",j);
                        }
                    }
                }
            }
            System.out.println();
        }
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

        // char型
        public static char[] str2char(String str) {
            return str.toCharArray();
        }
    }
}