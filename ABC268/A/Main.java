package ABC268.A;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abcde = Arrays.stream(sc.nextLine().split(" ")).distinct().mapToInt(Integer::parseInt).toArray();
        System.out.println(abcde.length);
        sc.close();
    }
}