package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int[] sums = getTwoSums(arr, K);
        assert sums != null;
        for (int num : sums) {
            System.out.print(num + " ");
        }
    }

    public static int[] getTwoSums(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sumToBe = target - nums[i];
            if (map.containsKey(sumToBe)){
                return new int[]{map.get(sumToBe), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
