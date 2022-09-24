package ABC270.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (0,0)からスタート
        // X座標がゴール、Y座標に壁、Z座標にハンマー
        int[] xyz = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int result = Integer.MAX_VALUE;
        //ゴールがマイナスかプラスか
        if(xyz[0]>0){
            if(xyz[1]<0){ //壁が進路に無い場合
                result = xyz[0]-0;
            }else if(xyz[1]>xyz[0]){ //壁が進路にない場合
                result = xyz[0]-0;
            }else{
                if(xyz[2]>xyz[1]){ //ハンマーが壁の先にある場合
                    result=-1;
                }else{
                    if(xyz[2]>0){ //ハンマーが進路上にあるか判定
                        result = xyz[0]-0;
                    }else{
                        result = Math.abs(xyz[2])*2; 
                        result += xyz[0]-0;
                    }
                }
            }
        }else{ //ゴールがマイナス
            if(xyz[1]>0){ //壁が進路に無い場合
                result = Math.abs(xyz[0])-0;
            }else if(xyz[1]<xyz[0]){ //壁が進路にない場合
                result = Math.abs(xyz[0])-0;
            }else{
                if(xyz[2]<xyz[1]){ //ハンマーが壁の先にある場合
                    result=-1;
                }else{
                    if(xyz[2]<0){ //ハンマーが進路上にあるか判定
                        result = Math.abs(xyz[0])-0;
                    }else{
                        result = Math.abs(xyz[2])*2; 
                        result += Math.abs(xyz[0])-0;
                    }
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}