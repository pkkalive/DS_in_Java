package GeeksForGeeks;

public class LeaderInTheArray {
    static void leader(int[] arr){
        int n = arr.length - 1;
        int curr_leader = arr[n];
        System.out.print(curr_leader + " ");
        for (int i = n - 1; i >= 0 ; i--) {
            if (arr[i] > curr_leader){
                System.out.print(arr[i] + " ");
                curr_leader = arr[i];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leader(new int[]{7, 10, 4, 3, 6, 5, 2});
        leader(new int[]{7, 10, 4, 10, 6, 5, 2});
        leader(new int[]{10, 20, 30});
        leader(new int[]{30, 20, 10});
    }
}
