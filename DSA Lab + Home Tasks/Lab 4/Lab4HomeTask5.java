import java.util.Arrays;
public class Lab4HomeTask5 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzagSort(arr);
        System.out.println("Zigzag sorted array: " + Arrays.toString(arr));}
    public static void zigzagSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((i % 2 == 0 && arr[i] > arr[i + 1]) || (i % 2 != 0 && arr[i] < arr[i + 1])) {
                // Swap if condition is met
                arr[i] ^= arr[i + 1];
                arr[i + 1] ^= arr[i];
                arr[i] ^= arr[i + 1];}}}}