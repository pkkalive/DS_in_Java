package LeetCode;

import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = buildArray(arr);
        for (int num: ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] buildArray(int[] nums){
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
