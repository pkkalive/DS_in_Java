package GeeksForGeeks;

import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisors(n);
    }
    public static void printAllDivisors(int n){
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
        for ( ; i >= 1; i--) {
            if (n % i == 0){
                System.out.print(n/i + " ");
            }
        }
    }
}
