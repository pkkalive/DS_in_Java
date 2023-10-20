package LeetCode;

import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = concatArray(arr);
        for (int num: ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] concatArray(int[] nums){
        int len = nums.length;
        int[] res = new int[len  * 2];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i];
            res[i + len] = nums[i];
        }
        return res;
    }
}
