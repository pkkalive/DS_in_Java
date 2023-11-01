package Scaler;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(getSphereVolume(A));
    }

    public static int getSphereVolume(int A){
        return (int) Math.ceil((4 * Math.PI * A * A * A)/3);
    }
}
