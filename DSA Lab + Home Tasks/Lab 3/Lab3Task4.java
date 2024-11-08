package lab3task4;
public class Lab3Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        int sum = sumArray(array, array.length);
        System.out.println("Sum of elements in the array: " + sum);
    }
    public static int sumArray(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return array[n - 1] + sumArray(array, n - 1);
    }
}