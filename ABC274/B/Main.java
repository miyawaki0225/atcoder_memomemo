package ABC274.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input_HW = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[][] input_matrix = new String[input_HW[0]][];
		for (int i = 0; i < input_HW[0]; i++) {
			input_matrix[i] = br.readLine().split("");
		}
		int[] count_array = new int[input_HW[1]];
		for (int i = 0; i < input_HW[0]; i++) {
			for (int j = 0; j < input_HW[1]; j++) {
				if(input_matrix[i][j].equals("#")){
					count_array[j]++;
				}
			}
		}

		for(int i=0;i<input_HW[1];i++){
			if(i>=input_HW[1]-1){
				System.out.print(count_array[i]);
			}else{
				System.out.print(count_array[i]+" ");
			}
		}
	}
}