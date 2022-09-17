package ABC269.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] s_matrix = new String[10][10];
        for(int i=0;i<10;i++){
            s_matrix[i]=sc.nextLine().split("");
        }
        int sharp_x_start=11;
        int sharp_x_end=11;
        int sharp_y_start = 11;
        int sharp_y_end = 11;

        for(int i=0;i<10;i++){
            if(sharp_x_start==11){
                //#が始まる行を確認
                if(Arrays.asList(s_matrix[i]).contains("#")){
                    sharp_x_start=i;
                    for(int j=0;j<10;j++){
                        //#が始まる列を確認
                        if(sharp_y_start==11){
                            if(s_matrix[i][j].equals("#")){
                                sharp_y_start=j;
                            }
                        }
                        //#が終わる列を確認
                        if(sharp_y_start!=11){
                            if(s_matrix[i][j].equals(".")){
                                sharp_y_end=j-1;
                                break;
                            }
                        }
                    }
                }
            }
            //#が終わる列を確認
            if(sharp_x_start!=11){
                if(!(Arrays.asList(s_matrix[i]).contains("#"))){
                    sharp_x_end=i-1;
                    break;
                }
            }
        }
        if(sharp_x_end==11){
            sharp_x_end=9;
        }
        if(sharp_y_end==11){
            sharp_y_end=9;
        }

        System.out.printf("%d %d%n",sharp_x_start+1,sharp_x_end+1);
        System.out.printf("%d %d%n",sharp_y_start+1,sharp_y_end+1);
        sc.close();
    }
}
