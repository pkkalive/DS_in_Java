package GeeksForGeeks;

public class MaximumIndex {
    static int maxIndex(int[] A){
        int N = A.length;
        if (A[0] <= A[N - 1]){
            return N - 1;
        }
        int maxDiff = 0;
        int left = N - 1, right = N - 1;
        int[] leftMin = new int[N];
        leftMin[0] = A[0];
        for (int i = 1; i < N; i++){
            leftMin[i] = Math.min(leftMin[i - 1], A[i]);
        }
        while (left >= 0 && right >= 0){
            if (A[right] >= leftMin[left]){
                maxDiff = Math.max(maxDiff, right - left);
                left--;
            } else {
                right--;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        System.out.println(maxIndex(new int[]{70, 83, 82, 39, 81}));
        System.out.println(maxIndex(new int[]{15, 86, 78, 93, 100, 6}));
        System.out.println(maxIndex(new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1}));
        System.out.println(maxIndex(new int[]{1, 10}));
        System.out.println(maxIndex(new int[]{85, 62, 2, 88, 16, 31, 36, 12, 10, 7, 79, 4, 37, 27, 63, 1, 4, 87}));
    }
}
