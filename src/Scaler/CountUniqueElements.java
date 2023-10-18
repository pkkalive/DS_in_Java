package Scaler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countUnique(arr));
    }

    public static int countUnique(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                count ++;
            }
        }
        return count;
    }
}
