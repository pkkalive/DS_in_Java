package GeeksForGeeks;

public class CheckAnagram {
    private static boolean isAnagram(String s1, String s2){
        int n = s1.length(), m = s2.length();
        if (n != m){
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int c: count){
            if (c != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcd","bcad"));
        System.out.println(isAnagram("listen","silent"));
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }
}
