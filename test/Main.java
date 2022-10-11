package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input_xy = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .map(n -> check(n))
                .toArray();
        String result = "No";
        if (input_xy[0] == input_xy[1]) {
            result = "Yes";
        }
        System.out.println(result);
    }

    private static int check(int num) {
        int[] grouping = { 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0 };
        return grouping[num - 1];
    }
}
