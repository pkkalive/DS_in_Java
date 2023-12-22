package GeeksForGeeks;

public class CheckSubSequence {
    private static boolean isSubSequence(String s1, String s2){
        int s1Len = s1.length(), s2Len = s2.length();
        int i = 0, j = 0;
        while (i < s1Len && j < s2Len){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2Len;
    }
    public static void main(String[] args) {
        System.out.println(isSubSequence("ABCDEF", "ABD"));
        System.out.println(isSubSequence("hello", "world"));
    }
}
