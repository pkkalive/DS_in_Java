package Scaler;

import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int percent = ((A + B + C + D + E)/5);
        System.out.println(percent);
        if (percent >= 90){
            System.out.println("A");
        } else if (percent >= 80){
            System.out.println("B");
        } else if (percent >= 70){
            System.out.println("C");
        } else if (percent >= 60){
            System.out.println("D");
        } else if (percent >= 40){
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
