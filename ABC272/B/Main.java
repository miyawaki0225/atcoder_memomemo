package ABC272.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        // 参加累計n人、舞踏会開催数m回
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        // 
        int[][] input_matrix = new int[nm[1]][]; 

        for(int i=0;i<nm[1];i++){
            input_matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        // 参加者の遭遇チェック
        int[][] result_matrix = new int[nm[0]][nm[0]];

        // チェック初期化
        for(int i=0;i<nm[0];i++){
            result_matrix[i][i]=1;
        }

        // 
        int length=0;
        for(int i=0;i<nm[1];i++){
            length = input_matrix[i][0]+1;
            // System.out.println(length);
            for(int j=1;j<length-1;j++){
                for(int k=j+1;k<length;k++){
                    result_matrix[input_matrix[i][j]-1][input_matrix[i][k]-1]=1;
                    result_matrix[input_matrix[i][k]-1][input_matrix[i][j]-1]=1;
                }
            }
        }

        // result表示
        String result_str = "Yes";
        for(int i=0;i<nm[0];i++){
            for(int j=0;j<nm[0];j++){
                if(result_matrix[i][j]==0){
                    result_str="No";
                    break;
                }
            }
            if(result_str.equals("No")){
                break;
            }
        }
        System.out.println(result_str);

    }
}