package AtCoderScores.abcPoint100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input_XAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input_XAB = Arrays.stream(input_XAB).sorted().toArray();
        int result = input_XAB[0] + input_XAB[1];
        System.out.println(result);
    }
}