package GeeksForGeeks;

public class MaximumDifferenceProblemWithOrder {

    static int maxDiff(int[] arr){
        int n = arr.length, res = arr[1] - arr[0], minVal = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{2, 3, 10, 6, 4, 8, 1}));
    }
}
