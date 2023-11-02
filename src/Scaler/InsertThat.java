package Scaler;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] nums = new int[N + 1];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 1){
            nums[0] = y;
            for(int i = 1; i < N; i++){
                nums[i] = arr[i - 1];
            }
        } else if (x == N){
            for(int i = 0; i < N; i++){
                nums[i] = arr[i];
            }
            nums[N] = y;
        } else {
            for(int i = 0; i < x - 1; i++){
                nums[i] = arr[i];
            }
            nums[x - 1] = y;
            for(int i = x; i <= N; i++){
                nums[i] = arr[i - 1];
            }
        }

        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
