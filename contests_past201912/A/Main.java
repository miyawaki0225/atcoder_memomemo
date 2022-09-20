package contests_past201912.A;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String regex_num = "^[0-9]+$";
        Pattern p1 = Pattern.compile(regex_num);
        Matcher m1 = p1.matcher(str);
        boolean result = m1.matches();
        if(result){
            int num = Integer.parseInt(str);
            System.out.println(num*2);
        }else{
            System.out.println("error");
        }
        sc.close();
    }   
}
