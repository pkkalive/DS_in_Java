package Scaler;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N + 1];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        insert(nums, x, y);
    }
    public static void insert(int[] nums, int x, int y){
        int len = nums.length - 1;
        for(int i = len; i > x - 1; i--){
            nums[i] = nums[i - 1];
        }
        nums[x - 1] = y;
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
