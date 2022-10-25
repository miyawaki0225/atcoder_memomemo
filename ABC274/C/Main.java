package ABC274.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input_N = Integer.parseInt(br.readLine());
		int[] input_HW = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
	}
}