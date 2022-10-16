package ABC273.C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        long input_N = Long.parseLong(br.readLine());
        long[] input_list_A = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();
        long[] sort_list = Arrays.stream(input_list_A).toArray();
        Arrays.sort(sort_list);

        long[] input_list_AA =Arrays.stream(sort_list)
        .distinct()
        .toArray();

        int result = 0;
        int count =0;
        int length = (int)(input_list_AA.length);
        for(int i=0;i<length;i++){
            for(int j = 0;j<length;j++){
                // System.out.printf(sort_list[i]+" ");
                if(input_list_A[i]==input_list_AA[j]){
                    result = length-(j+1);
                    break;
                }
            }
            // System.out.println();
            System.out.println(result);
        }
    }
}
