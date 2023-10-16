package GeeksForGeeks;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(isPrime(A));
    }

    public static boolean isPrime(int a){
        if (a == 1){
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0){
            return false;
        }
        for (int i = 5; i * i <= a ; i = i + 6) {
            if (a % i == 0 || a % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
