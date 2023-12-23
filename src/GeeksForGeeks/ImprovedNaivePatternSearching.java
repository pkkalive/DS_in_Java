package GeeksForGeeks;

public class ImprovedNaivePatternSearching {

    private static void patternSearching(String text, String pattern){
        int n = text.length(), m = pattern.length();
        for (int i = 0; i <= (n-m); ) {
            int j;
            for (j = 0; j < m; j++) {
                if (pattern.charAt(j) != text.charAt(i +j)){
                    break;
                }
            }
            if (j == m){
                System.out.print(i +" ");
            }
            if (j == 0){
                i++;
            } else {
                i = i + j;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        patternSearching("ABCABCD", "ABCD");
        patternSearching("ABCABCD", "GC");
        patternSearching("ALPHA", "PHA");
        patternSearching("AAAAAAAA", "AAA");
    }
}
