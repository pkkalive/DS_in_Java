package Scaler;

import java.util.Scanner;

public class RowColumnSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[] sums = rcSums(A);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i] + " ");
        }
    }

    public static int[] rcSums(int[][] A){
        int rows = A.length, cols = A[0].length;
        int[] ans = new int[rows + cols];

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + A[i][j];
            }
            ans[i] = rowSum;
        }
        int k = rows;
        for (int i = 0; i < cols; i++) {
            int colSum = 0;
            for (int[] ints : A) {
                colSum = colSum + ints[i];
            }
            ans[k] = colSum;
            k++;
        }
        return ans;
    }
}
