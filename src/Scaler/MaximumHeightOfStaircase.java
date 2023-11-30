package Scaler;

import java.util.Scanner;

public class MaximumHeightOfStaircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(maximumHeight(N));
    }

    static int maximumHeight(int A){
        int left = 0, right = A, ans = 0;
        while (left <= right){
            int mid = (left + right) / 2;
            long max_height = ((long) mid * (mid + 1))/ 2;
            if (max_height == A){
                return mid;
            } else if (max_height > A){
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
