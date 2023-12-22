package GeeksForGeeks;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    private static final int CHAR = 256;
    // Efficient Solution 1
    private static int getRepeatingCharacter1(String s) {
        int n = s.length() - 1, res = -1;
        boolean[] visited = new boolean[CHAR];

        for (int i = n; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }

    // Efficient Solution 2
    private static int getRepeatingCharacter2(String s) {
        int n = s.length(), res = Integer.MAX_VALUE;
        int[] count = new int[CHAR];
        Arrays.fill(count, -1);

        for (int i = 0; i < n; i++) {
            int feq = count[s.charAt(i)];
            if (feq == -1) {
                count[s.charAt(i)] = i;
            } else {
                res = Math.min(res, feq);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    //Better Solution
    private static int getRepeatingCharacter(String s){
        int[] count = new int[CHAR];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Efficient Solution 1
        System.out.println(getRepeatingCharacter1("geeksforgeeks"));
        System.out.println(getRepeatingCharacter1("alpha"));
        System.out.println(getRepeatingCharacter1("hello"));
        System.out.println(getRepeatingCharacter1("aeepple"));
        System.out.println(getRepeatingCharacter1("world"));

        // Efficient Solution 2
        System.out.println(getRepeatingCharacter2("geeksforgeeks"));
        System.out.println(getRepeatingCharacter2("alpha"));
        System.out.println(getRepeatingCharacter2("hello"));
        System.out.println(getRepeatingCharacter2("aeepple"));
        System.out.println(getRepeatingCharacter2("world"));

        // Better Solution
        System.out.println(getRepeatingCharacter("geeksforgeeks"));
        System.out.println(getRepeatingCharacter("alpha"));
        System.out.println(getRepeatingCharacter("hello"));
        System.out.println(getRepeatingCharacter("aeepple"));
        System.out.println(getRepeatingCharacter("world"));
    }
}
