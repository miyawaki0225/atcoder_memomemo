package ABC271.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String hex = Integer.toHexString(num).toUpperCase();
        if(num<16){
            hex="0"+hex;
        }
        System.out.println(hex);
        sc.close();
    }   
}