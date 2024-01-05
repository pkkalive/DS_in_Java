package GeeksForGeeks.Sorting;

public class QuickSort {
    // Lomuto Partition
    static int lomutoPartition(int[] arr, int low, int high){
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

    // Hoare Partition
    static int hoarePartition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while(arr[i] < pivot);
            do {
                j--;
            } while(arr[j] > pivot);
            if (i >= j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static void print(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void lomutoQuickSort(int[] arr, int left, int right){
        if (left < right){
            int point = lomutoPartition(arr, left, right);
            lomutoQuickSort(arr, left, point - 1);
            lomutoQuickSort(arr, point + 1, right);
        }
    }

    static void hoareQuickSort(int[] arr, int left, int right){
        if (left < right){
            int point = hoarePartition(arr, left, right);
            hoareQuickSort(arr, left, point);
            hoareQuickSort(arr, point + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 10, 8, 7};
        int[] arr2 = new int[]{2, 1, 4, 3};
        int[] arr3 = new int[]{3, 5, 10, 20, 30, 40};

        //Bubble Sort
        lomutoQuickSort(arr1, 0, arr1.length - 1);
        print(arr1);
        lomutoQuickSort(arr2, 0, arr2.length - 1);
        print(arr2);
        lomutoQuickSort(arr3, 0, arr3.length - 1);
        print(arr3);

        arr1 = new int[]{2, 10, 8, 7};
        arr2 = new int[]{2, 1, 4, 3};
        arr3 = new int[]{3, 5, 10, 20, 30, 40};

        // Optimise Bubble Sort
        hoareQuickSort(arr1, 0, arr1.length - 1);
        print(arr1);
        hoareQuickSort(arr2, 0, arr2.length - 1);
        print(arr2);
        hoareQuickSort(arr3, 0, arr3.length - 1);
        print(arr3);
    }
}
