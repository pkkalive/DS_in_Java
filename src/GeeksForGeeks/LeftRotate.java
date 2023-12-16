package GeeksForGeeks;

public class LeftRotate {

    static void reverse(int[] arr, int left, int right){
        while (left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static int[] leftRotateByK(int[] arr, int k){
        int n = arr.length;
        int d = k % n;
        if(d >= 0){
            reverse(arr, 0, d - 1);
            reverse(arr, d, n-1);
            reverse(arr, 0, n -1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ans = leftRotateByK(new int[]{1, 2, 3, 4, 5}, 2);
        for (int item: ans) {
            System.out.print(item + " ");
        }
        System.out.println();
        ans = leftRotateByK(new int[]{10, 5, 30, 15}, 3);
        for (int item: ans) {
            System.out.print(item + " ");
        }
    }
}
