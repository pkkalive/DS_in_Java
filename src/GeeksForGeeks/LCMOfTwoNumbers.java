package GeeksForGeeks;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(lcm(A, B));
        System.out.println(betterLCM(A, B));
    }

    // Time Complexity is O(a * b - max(a,b))
    public static int lcm(int a, int b){
        int ans = Math.max(a, b);
        if (a % b == 0 || b % a == 0){
            return ans;
        }
        while (true){
            if (ans % a == 0 && ans % b == 0){
                break;
            }
            ans ++;
        }
        return ans;
    }

    public static int gcd (int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    // Time Complexity: O(log(min(a,b))
    public static int betterLCM (int a, int b){
        return (a * b)/gcd(a, b);
    }
}
