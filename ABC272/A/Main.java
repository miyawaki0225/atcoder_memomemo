package ABC272.A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println(result);
        sc.close();
    }   
}