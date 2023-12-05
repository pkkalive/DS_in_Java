package LeetCode;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(isEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(isEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }
    static Boolean isEqual(String[] word1, String[] word2){
        StringBuilder firstSB = new StringBuilder();
        StringBuilder secondSB = new StringBuilder();
        for (String s : word1){
            firstSB.append(s);
        }
        for (String s : word2){
            secondSB.append(s);
        }
        return firstSB.toString().contentEquals(secondSB);
    }
}
