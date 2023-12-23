package GeeksForGeeks;


public class ReverseWordInString {

    private static void reverse(char[] s, int left, int right){
        while(left <= right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

    private static String trimWords(char[] words){
        int n = words.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (i <= n - 2 && words[i] == ' ' && words[i + 1] != ' '){
                words[idx] = ' ';
                idx += 1;
            }
            if (words[i] != ' '){
                char temp = words[i];
                words[i] = words[idx];
                words[idx] = temp;
                idx += 1;
            }

        }
        return new String(words).trim();
    }
    private static String reverseWords(String s){
        char[] s_array = s.trim().toCharArray();
        int start = 0, n = s_array.length;
        for (int end = 0; end < n; end++){
            if (s_array[end] == ' ' && s_array[start] != ' '){
                reverse(s_array, start, end - 1);
                start = end + 1;
            }
            if (s_array[start] == ' ' && s_array[end] == ' '){
                start++;
                end++;
            }
        }
        reverse(s_array, start, n - 1);
        reverse(s_array, 0, n - 1);
        return trimWords(new String(s_array).trim().toCharArray());
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("Welcome to geeksforgeeks"));
        System.out.println(reverseWords("I love Java Programming"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a                   good                           example"));

    }
}
