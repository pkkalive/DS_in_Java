package Scaler;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int[] ans = divisible(A);
        for (int item: ans) {
            System.out.print(item + " ");
        }
    }

    public static int[] divisible(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num: arr) {
            if (num % 5 == 0 && num % 7 == 0){
                list.add(num);
            }
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = list.get(i);
        }
        return intArray;
    }
}
