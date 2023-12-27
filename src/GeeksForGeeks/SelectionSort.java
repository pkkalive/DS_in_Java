package GeeksForGeeks;

public class SelectionSort {
    private static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        print(arr);
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

        //Selection Sort
        selectionSort(arr1);
        selectionSort(arr2);
        selectionSort(arr3);
    }
}
