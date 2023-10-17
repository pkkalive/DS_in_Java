package Scaler;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i < T; i++) {
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isArmStrong(int num){
        if (num == 1){
            return true;
        }
        int original = num;
        int ans = 0;
        while (num > 0) {
            int last = num % 10;
            ans = ans + (last * last * last);
            num = num / 10;
        }
        return original == ans;
    }
}
