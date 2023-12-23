package GeeksForGeeks;

public class NaivePatternSearching {

    private static void patternSearch(String text, String pattern){
        char[] text_array = text.toCharArray();
        char[] pattern_array = pattern.toCharArray();
        int n = text_array.length, m = pattern_array.length;
        if (m > n){
            System.out.println(" ");
        }
        int i = 0, j;
        while( i <= n - m ){
            j = 0;
            while (j < m){
                if(pattern_array[j] != text_array[i + j]){
                    break;
                }
                j++;
            }
            if (j == m){
                System.out.print(i +" ");
            }
            i++;

        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        patternSearch("ABCABCD", "ABCD");
        patternSearch("ABCABCD", "GC");
        patternSearch("ALPHA", "PHA");
        patternSearch("AAAAAAAA", "AAA");
    }
}
