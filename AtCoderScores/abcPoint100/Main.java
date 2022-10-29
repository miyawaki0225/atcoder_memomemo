package AtCoderScores.abcPoint100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final void solve() throws IOException{
        String[] input_n = s_array_none();
        String result="";
        for(String str:input_n){
            if(str.equals("1")){
                result+="9";
            }else if(str.equals("9")){
                result+="1";
            }else{
                result+=str;
            }
        }

        System.out.println(result);

    }
    //input

    //int
    public static int i_num() throws IOException{
        return Integer.parseInt(br.readLine());
    }

    //int配列
    public static int[] i_array() throws IOException{
        return Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    //String
    public static String s_str() throws IOException{
        return br.readLine();
    }
    
    //String配列
    public static String[] s_array_none() throws IOException{
        return br.readLine().split("");
    }

    public static String[] s_array_blank() throws IOException{
        return br.readLine().split(" ");
    }
    
    //main
    public static void main(String[] args) throws Exception {
        solve();
    }
}