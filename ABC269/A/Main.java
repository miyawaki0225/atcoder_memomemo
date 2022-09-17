package ABC269.A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abcd = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((abcd[0]+abcd[1])*(abcd[2]-abcd[3]));
        System.out.println("Takahashi");
        sc.close();
    }   
}
