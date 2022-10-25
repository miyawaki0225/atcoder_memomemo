package ABC274.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        double[] input_AB = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double result = input_AB[1] / input_AB[0];
        System.out.printf("%.03f",result);
    } 
}
