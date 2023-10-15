package GeeksForGeeks;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(trailingZeros(A));
    }

    // Best Solution time complexity: log(N)
    public static int trailingZeros(int num){
        int count = 0;
        for (int i = 5; i <= num; i = i * 5){
            count = count + num/i;
        }
        return count;
    }

    // Cannot handle overflow
    public static int factorial(int num){
        int res = 1;
        for (int i = 2; i <= num; i++){
            res = res * i;
        }
        return res;
    }
    public static int countZeros (int num) {
        int count = 0;
        while (num % 10 == 0){
            count ++;
            num = num / 10;
        }
        return count;
    }
}
