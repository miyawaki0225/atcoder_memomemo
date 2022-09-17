package ABC268.B;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] p_array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //最大試行回数
        int min_lcm = lcm(p_array.length/n,p_array.length);
        int[][] all_array = new int[min_lcm][p_array.length];
        int y_int = 0;
        for(int i=0;i<min_lcm;i++){
            for(int j=0;j<p_array.length;j++){
                y_int = Math.floorMod(((all_array.length/n)*(i+1)+j), p_array.length);
                all_array[i][y_int]=p_array[j];
            }
        }
        int plus_position=0;
        int minus_position=0;
        int count=0;
        int max_count = 0;
        for(int i=0;i<min_lcm;i++){
            for(int j=0;j<p_array.length;j++){
                plus_position=all_array[i][Math.floorMod(j+1,p_array.length)];
                minus_position=all_array[i][Math.floorMod(Integer.MAX_VALUE,p_array.length)];
                if(p_array[j]==all_array[i][plus_position]||p_array[j]==all_array[i][minus_position]){
                    count++;
                }
            }
            if(count>=p_array.length){
                max_count=count;
                break;
            }else{
                if(max_count<count){
                    max_count=count;
                };
                count=0;
            }
        }
        System.out.println(max_count);
        sc.close();
    }
    public static int lcm(int a, int b){
        int temp;
        long  c =a;
        c*=b;
        while((temp=a%b)!=0){
            a=b;
            b=temp;
        }
        return (int)(c/b);
    }
}