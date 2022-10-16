package ABC273.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        long input_N = Long.parseLong(br.readLine());
        long[] list_long = LongStream.rangeClosed(1, input_N).toArray();
        long result = 1;
        for(long l:list_long){
            result *= l;
        }
        System.out.println(result);
    } 
}
