import java.util.Random;

public class ArrayGenerator {
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000); // random numbers 0–9999
        }
        return arr;
    }
}
