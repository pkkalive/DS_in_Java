package Scaler;

import java.util.Scanner;

public class MaxProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(maxProduct(A));
    }

    public static int maxProduct(int[] A) {
        int len = A.length;
        if (len == 2){
            return A[0] * A[1];
        }
        int firstPositiveMax = Integer.MIN_VALUE;
        int secondPositiveMax = Integer.MIN_VALUE;
        int firstPositiveMaxIdx = -1;

        int firstNegativeMin = Integer.MAX_VALUE;
        int secondNegativeMin = Integer.MAX_VALUE;
        int firstNegativeMinIdx = -1;

        for (int i = 0; i < len; i++){
            if (A[i] > 0){
                firstPositiveMax = Math.max(firstPositiveMax, A[i]);
                firstPositiveMaxIdx = i;
            } else {
                firstNegativeMin = Math.min(firstNegativeMin, A[i]);
                firstNegativeMinIdx = i;
            }
        }
        for (int i = 0; i < len; i++){
            if (A[i] > 0){
                if (i != firstPositiveMaxIdx){
                    secondPositiveMax = Math.max(A[i], secondPositiveMax);
                }
            } else {
                if (i != firstNegativeMinIdx){
                    secondNegativeMin = Math.min(A[i], secondNegativeMin);
                }
            }
        }
        return Math.max((firstPositiveMax * secondPositiveMax), (firstNegativeMin * secondNegativeMin));
    }
}
