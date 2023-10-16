package Scaler;

import java.sql.Array;
import java.util.Scanner;

public class FirstVSLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i ++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(firstLast(arr[i])[0] + " " + firstLast(arr[i])[1]);
        }
    }

    public static int[] firstLast(int a){
        if (a <= 9){
            return new int[]{a, a};
        }
        int last = a % 10;
        int first = a;
        while (first >= 10){
            first = first / 10;
        }
        return new int[]{first, last};
    }
}
