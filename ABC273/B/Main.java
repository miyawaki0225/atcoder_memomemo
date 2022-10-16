package ABC273.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        long[] input_XK = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        double input_X = input_XK[0];
        for(int i=0;i<input_XK[1];i++){
            input_X /=10;
            input_X = (double)Math.round(input_X);
        }
        long result = (long)(input_X * Math.pow(10, input_XK[1]));
        System.out.println(result);
    } 
}
