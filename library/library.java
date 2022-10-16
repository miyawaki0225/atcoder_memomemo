package library;

import java.util.Arrays;
import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        // Scasnner
        Scanner sc = new Scanner(System.in);
        // 文字読み込み

        // 数字配列読み取り（1桁毎）
        int[] input_array_number = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        // 数字配列読み取り（空白区切り）
        // int[] input_array_blank = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Arrays.stream(input_array_number).forEach(System.out::println);

        // Scanner 閉じる
        sc.close();
    }
}
