import java.util.Arrays;
import java.util.Random;

public class BinarySearchAnalyzer {
    public static void main(String[] args) {
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        int[] sizes = {100, 500, 1000};
        Random rand = new Random();

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(10000);
            }

            Arrays.sort(arr); // Binary search needs sorted array
            int target = arr[rand.nextInt(size)];

            long start = System.nanoTime();
            int result = binarySearch(arr, target);
            long end = System.nanoTime();

            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%-10d | %.3f%n", size, timeMs);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

