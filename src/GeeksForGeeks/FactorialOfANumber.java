package GeeksForGeeks;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(factorial(A));
        System.out.println(fact(A));
    }

    // Iterative Solution
    public static int factorial(int num){
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            ans = ans * i;
        }
        return ans;
    }

    // Recursive Solution
    public static int fact(int num){
        if (num == 0){
            return 1;
        }
        return num * fact(num - 1);
    }
}
