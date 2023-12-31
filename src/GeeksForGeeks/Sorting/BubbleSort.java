package GeeksForGeeks.Sorting;

public class BubbleSort {
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

    private static void optimiseBubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
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

        //Bubble Sort
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);

        arr1 = new int[]{2, 10, 8, 7};
        arr2 = new int[]{2, 1, 4, 3};
        arr3 = new int[]{3, 5, 10, 20, 30, 40};

        // Optimise Bubble Sort
        optimiseBubbleSort(arr1);
        optimiseBubbleSort(arr2);
        optimiseBubbleSort(arr3);

    }
}
