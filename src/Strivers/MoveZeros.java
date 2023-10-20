package Strivers;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = moveZeros(arr);
        for (int num: ans){
            System.out.print(num + " ");
        }
    }

    public static int[] moveZeros(int[] nums){
        int first_zero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                first_zero = i;
                break;
            }
        }
        if (first_zero != -1) {
            for (int i = first_zero + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[first_zero] = nums[i];
                    nums[i] = 0;
                    first_zero++;
                }
            }
        }
        return nums;
    }
}
