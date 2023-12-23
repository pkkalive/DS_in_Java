package GeeksForGeeks;

public class NaivePatternSearching {

    private static void patternSearch(String text, String pattern){
        int n = text.length(), m = pattern.length();
        if (m > n){
            System.out.println(" ");
        }
        int i = 0, j;
        while( i <= n - m ){
            j = 0;
            while (j < m){
                if(pattern.charAt(j)!= text.charAt(i + j)){
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
