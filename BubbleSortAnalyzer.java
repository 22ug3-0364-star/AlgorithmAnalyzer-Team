public class BubbleSortAnalyzer {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        System.out.println("Algorithm: Bubble Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);

            long start = System.nanoTime();
            bubbleSort(arr);
            long end = System.nanoTime();

            double time = (end - start) / 1_000_000.0;
            System.out.printf("%-11d | %.4f%n", size, time);
        }
    }
}

