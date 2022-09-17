package ABC267.A;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;
        switch(s){
            case "Monday":
                result = 5;
                break;
            case "Tuesday":
                result = 4;
                break;
            case "Wednesday":
                result = 3;
                break;
            case "Thursday":
                result = 2;
                break;
            case "Friday":
                result = 1;
                break;
        }
        System.out.println(result);
        sc.close();
    }
}