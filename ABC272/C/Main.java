package ABC272.C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        List<BigDecimal> n_list = Arrays.stream(br.readLine().split(" "))
        .map(BigDecimal::new)
        .collect(Collectors.toList());
        Collections.sort(n_list);
        n_list.forEach(System.out::println);
    }
}
