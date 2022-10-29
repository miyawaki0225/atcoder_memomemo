package ABC275.C;

import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter out = new PrintWriter(System.out);

    // 解答作成用
    public static void solve() throws IOException {
        // io
        int len = 9;
        String[][] matrix = new String[len][];
        for (int i = 0; i < len; i++) {
            matrix[i] = IO.input_n_array();
        }
        // for (String[] array : matrix) {
        //     System.out.println(Arrays.toString(array));
        // }
        int counter = 0;
        int len_side = 0;
        
        for (int height = 0; height < len; height++) {
            for (int i = 0; i < len - 1; i++) {
                if (matrix[height][i].equals("#")) {
                    // 横：正方形のカウント
                    for (int j = i + 1; j < len; j++) {
                        if (matrix[height][j].equals("#")) {
                            len_side = j - i;
                            if (height + len_side < 9) {
                                // System.out.printf("height=%d i=%d j=%d len_side=%d\n",height,i,j,len_side);
                                if (matrix[height+len_side][i].equals("#")
                                        && matrix[height+len_side][j].equals("#")) {
                                    // System.out.printf("i=%d j=%d\n", i, j);
                                    counter++;
                                };
                            }
                        }
                    }
                    // System.out.println("正方形:"+counter);
                    // ななめ：カウント
                    for(int j=1;j<len;j++){
                        if(height+j<len){
                            for(int k=0;k<i;k++){
                                // 正方形以外の時判定
                                if (matrix[height+j][k].equals("#")) {
                                    len_side= i - k;
                                    // System.out.printf("height=%d i=%d j=%d k=%d len_side=%d\n",height,i,j,k,len_side);
                                    if(height + j + len_side < 9 && i + j <9){
                                        if(matrix[height+j+len_side][k+j].equals("#")&&matrix[height+len_side][i+j].equals("#")){
                                            counter++;
                                        }
                                        // if(matrix[height+j+len_side][k+j].equals("#")&&matrix[height+len_side][i+len_side].equals("#")){
                                        //     counter++;
                                        // }
                                    }
                                    // System.out.println(counter);
                                }
                            }
                        }
                    }
                }
            }
        }
        int result = counter;
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