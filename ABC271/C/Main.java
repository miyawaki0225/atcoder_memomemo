package ABC271.C;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) {
        // 不正解中 10/03
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        List<Integer> n_list = Arrays.stream(sc.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        Collections.sort(n_list);
        LinkedList<Integer> list = new LinkedList<>(n_list);
        
        while (list.size() != n) list.add(-1);
 
        for (int i = 1; i <= n; i++) {
            if (list.getFirst() == i) {
                list.removeFirst();
            } else if (list.size() < 2) {
                System.out.println(i-1);
                break;
            } else {
                list.removeLast();
                list.removeLast();
            }
            if (list.size() == 0) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}