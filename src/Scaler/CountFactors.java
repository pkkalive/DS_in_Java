package Scaler;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(count(A));
    }

    public static int count(int num){
        if (num == 0){
            return 0;
        }
        int count = 2;
        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0){
                if (i * i == num){
                    count ++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
