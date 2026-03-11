public class Algorithm_0304_Assignments_2 {

    // 1. Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 2. Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    // 3. Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
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

    // 產生隨機陣列供測試使用
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 10000); 
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 50000, 100000}; 

        System.out.println("=== Assignment 2: 排序演算法實證 ===");
        
        for (int size : sizes) {
            System.out.println("\n[資料量 n = " + size + "]");
            int[] originalArray = generateRandomArray(size);
            long startTime, endTime;

            // Quick Sort
            int[] arrQuick = originalArray.clone();
            startTime = System.currentTimeMillis();
            quickSort(arrQuick, 0, arrQuick.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Quick Sort 耗時: " + (endTime - startTime) + " ms");

            // Insertion Sort
            int[] arrInsertion = originalArray.clone();
            startTime = System.currentTimeMillis();
            insertionSort(arrInsertion);
            endTime = System.currentTimeMillis();
            System.out.println("Insertion Sort 耗時: " + (endTime - startTime) + " ms");

            // Bubble Sort
            int[] arrBubble = originalArray.clone();
            startTime = System.currentTimeMillis();
            bubbleSort(arrBubble);
            endTime = System.currentTimeMillis();
            System.out.println("Bubble Sort 耗時: " + (endTime - startTime) + " ms");
        }
    }
}