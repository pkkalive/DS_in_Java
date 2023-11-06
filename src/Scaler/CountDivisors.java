package Scaler;

import java.util.Scanner;

public class CountDivisors {
    static int[] primeFactors;
    static int limit = 1001001;
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int num: nums) {
            System.out.print(countDivisors(num) + " ");
        }
    }

    static void sieve(){
        primeFactors = new int[limit];
        for (int i = 1; i < limit; i++){
            primeFactors[i] = i;
        }
        for (int i = 2; i * i <= limit; i++) {
            for (int j = i * i; j < limit ; j = j + i) {
                if (primeFactors[j] == j){
                    primeFactors[j] = i;
                }
            }
        }
    }
    public static int countDivisors(int num){
        int ans = 1;
        while (num != 1){
            int count = 1, factor = primeFactors[num];
            while (num != 1 && (num % factor) == 0){
                count += 1;
                num = num / factor;
            }
            ans = ans * count;
        }
        return ans;
    }
}
