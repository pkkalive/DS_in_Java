package Scaler;

import java.util.Scanner;

public class SumTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getSum(arr));
    }
    public static int getSum(int[] nums){
        int total = 0;
        for (int num: nums){
            total += num;
        }
        return total;
    }
}
