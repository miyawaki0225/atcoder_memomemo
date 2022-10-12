package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//入力値までの素数の個数を算出
		System.out.println("値を入力してください。");
		System.out.printf(">>>");
		int result = furui(Integer.parseInt(br.readLine()));

		System.out.printf("答え%s", result);
	}

	private static int furui(int num) {
		int[] result_array = IntStream.rangeClosed(1, num).toArray();
		for (int i = 1; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				if (result_array[i] != 0) {
					if (result_array[j] != 0) {
						if (result_array[j] % result_array[i] == 0) {
							result_array[j] = 0;
						}
					}
				}
			}

		}
		int[] hyouji = Arrays.stream(result_array)
				.filter(n -> n != 1)
				.filter(n -> n != 0)
				.toArray();
		System.out.println(Arrays.toString(hyouji));
		return hyouji.length;
	}
>>>>>>> master
}
