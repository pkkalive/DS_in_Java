package GeeksForGeeks;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {
    private static final int CHAR = 256;

    // Efficient Solution 1
    private static int getNonRepeatingCharacter1(String s){
        int n = s.length(), res = Integer.MAX_VALUE;
        int[] visited = new int[CHAR];
        Arrays.fill(visited, -1);

        for (int i = 0; i < n; i++) {
            if (visited[s.charAt(i)] == -1){
                visited[s.charAt(i)] = i;
            } else {
                visited[s.charAt(i)] = -2;
            }
        }
        for (int i = 0; i < CHAR; i++) {
            if (visited[i] >= 0){
                res = Math.min(res, visited[i]);
            }
        }
        return res;
    }

    // Efficient Solution 2
    private static int getNonRepeatingCharacter2(String s){
        int n = s.length() - 1, res = -1;
        boolean[] visited = new boolean[CHAR];

        for (int i = n; i >= 0; i--) {
            if (!(visited[s.charAt(i)])){
                res = i;
            }
            visited[s.charAt(i)] = true;
        }
        return res;
    }

    public static void main(String[] args) {
        // Efficient Solution 1
        System.out.println(getNonRepeatingCharacter1("geeksforgeeks"));
        System.out.println(getNonRepeatingCharacter1("alpha"));
        System.out.println(getNonRepeatingCharacter1("hello"));
        System.out.println(getNonRepeatingCharacter1("aeepple"));
        System.out.println(getNonRepeatingCharacter1("world"));

        // Efficient Solution 2
        System.out.println(getNonRepeatingCharacter2("geeksforgeeks"));
        System.out.println(getNonRepeatingCharacter2("alpha"));
        System.out.println(getNonRepeatingCharacter2("hello"));
        System.out.println(getNonRepeatingCharacter2("aeepple"));
        System.out.println(getNonRepeatingCharacter2("world"));
    }
}
