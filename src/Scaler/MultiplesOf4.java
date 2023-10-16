package Scaler;

import java.util.Scanner;

public class MultiplesOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int excess = multiple(N);
        if (excess != 0){
            N = N - excess;
        }
        int i = 4;
        while (i <= N){
            System.out.print(i + " ");
            i = i + 4;
        }
    }

    public static int multiple(int num){
        int last2 = 0;
        int multiplier = 1;
        for (int i = 0; i < 2; i++){
            last2 = last2 + ((num % 10) * multiplier);
            multiplier = multiplier * 10;
            num = num / 10;
        }
        return last2 % 4;
    }
}
