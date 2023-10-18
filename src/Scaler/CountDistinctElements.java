package Scaler;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(distinct(arr));
    }

    public static int distinct(int[] arr){
        if (arr.length <= 1 ){
            return arr.length;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
