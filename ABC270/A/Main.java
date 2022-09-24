package ABC270.A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ab_array = sc.nextLine().split(" ");
        int s_point =0;
        boolean[] result = new boolean[5];
        //MAX7点
        for(String str:ab_array){
            if(str.equals("0")){
                result[0]=true;
            }else if(str.equals("1")){
                result[1]=true;
            }else if(str.equals("2")){
                result[2]=true;
            }else if(str.equals("4")){
                result[4]=true;
            }else if(str.equals("3")){
                result[1]=true;
                result[2]=true;
            }else if(str.equals("5")){
                result[1]=true;
                result[4]=true;
            }else if(str.equals("6")){
                result[2]=true;
                result[4]=true;
            }else if(str.equals("7")){
                result[1]=true;
                result[2]=true;
                result[4]=true;
            }  
        }
        for(int i=0;i<5;i++){
            if(result[i]){
                s_point+=i;
            }
        }

        System.out.println(s_point);
        sc.close();
    }   
}