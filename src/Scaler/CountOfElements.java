package Scaler;

import java.util.Scanner;

public class CountOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(countElements(nums));
    }

    public static int countElements(int[] A){
        int count = 1, max = A[0], len = A.length;
        for (int i = 1; i < len; i++) {
            if (A[i] > max){
                max = A[i];
                count = 1;
            } else if (A[i] == max) {
                count++;
            }
        }
        return len - count;
    }
}
