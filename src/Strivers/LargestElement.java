package Strivers;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));
    }

    public static int largest(int[] nums){
        int larger = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num > larger){
                larger = num;
            }
        }
        return larger;
    }
}
