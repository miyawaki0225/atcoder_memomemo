package ABC267.B;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        String result = "No";
        
        //条件：ピン１が倒れている
        //それらの列の間に、ピンがすべて倒れている列が存在する
        //[7],[4],[2,8],[1,5],[3,9],[6]

        //列の状態を判定する
        //0:全て倒れている
        //1:1本以上たっている
        int[] array_status = new int[7];
        if(array[6]==1)array_status[0]=1;
        if(array[3]==1)array_status[1]=1;
        if(array[1]==1||array[7]==1)array_status[2]=1;
        if(array[4]==1)array_status[3]=1;
        if(array[2]==1||array[8]==1)array_status[4]=1;
        if(array[5]==1)array_status[5]=1;
        if(array[9]==1)array_status[6]=1;
        
        // for(int n:array_status){
        //     System.out.println("n:"+n);
        // }
        boolean break_flg = false;
        if(array[0]==0){
            for(int i=0;i<5;i++){
                if(array_status[i]==1){
                    for(int j=6;j>1;j--){
                        if(array_status[j]==1){
                            for(int k=i+1;k<j;k++){
                                if(array_status[k]==0){
                                    result="Yes";
                                    System.out.printf("i=%d j=%d k=%d\n",i,j,k);
                                    break_flg=true;
                                }
                                if(break_flg==true)break;
                            }
                            if(break_flg==true)break;
                        }
                        if(break_flg==true)break;
                    }
                } 
                if(break_flg==true)break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}