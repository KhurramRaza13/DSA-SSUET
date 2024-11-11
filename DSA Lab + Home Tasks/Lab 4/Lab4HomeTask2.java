import java.util.Arrays;
public class Lab4HomeTask2 {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.7, 4.1, 5.6, 6.3, 1.8, 9.4};
        double key = 5.6;
        splitArray(arr, key);}
    public static void splitArray(double[] arr, double key) {
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Part 1: " + Arrays.toString(Arrays.copyOfRange(arr, 0, index)));
            System.out.println("Part 2: " + Arrays.toString(Arrays.copyOfRange(arr, index + 1, arr.length)));} else {
            System.out.println("Key not found!");}}}