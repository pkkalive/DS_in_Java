package GeeksForGeeks;

import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(gcd(A, B));
        System.out.println(betterGCD(A, B));
    }

    // Time complexity is min of A, B in worse case its O(min(A, B))
    public static int gcd(int a, int b){
        int ans = Math.min(a, b);
        while (ans > 0){
            if (a % ans == 0 && b % ans == 0){
                break;
            }
            ans --;
        }
        return ans;
    }
    // Time complexity is O(log(min(A, B)))
    public static int betterGCD(int a, int b){
        if (b == 0){
            return a;
        }
        return betterGCD(b, a % b);
    }
}
