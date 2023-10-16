package Scaler;

import java.util.Scanner;

public class CodingRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String rating = "";
        if (N >= 2100){
            rating = "grand master";
        } else if (N >= 1900){
            rating = "candidate master";
        } else if (N >= 1600) {
            rating = "expert";
        } else if (N >= 1400) {
            rating = "pupil";
        } else {
            rating = "newbie";
        }
        System.out.println((N & 1) == 0 ? rating.toUpperCase() : rating);
    }
}
