package GeeksForGeeks;

public class KthSmallest {
     static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high ; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static int kthSmallest(int[] arr, int k){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int p = partition(arr, left, right);
            if(p == k - 1){
                return p;
            } else if (p < k - 1) {
                left = p + 1;
            } else {
                right = p - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,4,5,8,11,6,26};
        int k = 4;
        int index = kthSmallest(arr, k);
        System.out.print(arr[index]);
    }
}
