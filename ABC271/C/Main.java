package ABC271.C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a_array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a_array);
        int[] result_array = Arrays.copyOf(a_array, a_array.length);
        int array_position=0;
        int count = 0;
        if(n > 1){
            for(int i=0;;){
                if(a_array[array_position] == (i+1)){
                    count++;
                    i++;
                    array_position++;
                } else {
                    n -= 2;
                    if(n > 0){
                        result_array[n]=0;
                        result_array[n+1]=0;
                        if( result_array[array_position]!=0){
                            count++;
                            i++;
                        } else {
                            break;
                        }
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}