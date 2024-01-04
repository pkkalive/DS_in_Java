package GeeksForGeeks;

public class MergeSort {
    private static void mergeSort(int[] arr, int left, int right){
        if(right > left){
            int mid = left + (right - left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for(int i = 0; i < n1; i++) {
            leftArray[i] = arr[i + left];
        }
        for(int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while(i < n1) {
            arr[k++] = leftArray[i++];
        }
        while(j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    private static void print(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 10, 8, 7};
        int[] arr2 = new int[]{2, 1, 4, 3};
        int[] arr3 = new int[]{3, 5, 10, 20, 30, 40};

        //Insertion Sort
        mergeSort(arr1, 0, arr1.length - 1);
        print(arr1);
        mergeSort(arr2, 0, arr2.length - 1);
        print(arr2);
        mergeSort(arr3, 0, arr3.length - 1);
        print(arr3);
    }
}


