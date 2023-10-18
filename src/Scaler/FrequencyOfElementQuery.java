package Scaler;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = setArray(N);
        int M = sc.nextInt();
        int[] B = setArray(M);
        int[] res = frequency(A, B);
        for (int freq: res) {
            System.out.print(freq + " ");
        }

    }
    public static int[] setArray(int len){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] frequency (int[] A, int[] B){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] freq = new int[B.length];
        int i = 0;
        for (int num: A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int query: B) {
            freq[i] = map.getOrDefault(query,0);
            i++;
        }
        return freq;
    }
}
