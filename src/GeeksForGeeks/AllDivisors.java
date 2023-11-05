package GeeksForGeeks;

import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisors(n);
    }
    public static void printAllDivisors(int n){
        System.out.print(1 + " ");
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                if (i * i == n){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
        System.out.print(n + " ");
    }
}
