package Scaler;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println(countUnique(A));
    }

    public static int countUnique(int[] A){
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]){
                A[i] = A[i] + 1;
                count ++;
            }
            if (A[i] < A[i - 1]){
                int diff = (A[i - 1] + 1) - A[i];
                A[i] = A[i] + diff;
                count = count + diff;
            }
        }
        return count;
    }
}