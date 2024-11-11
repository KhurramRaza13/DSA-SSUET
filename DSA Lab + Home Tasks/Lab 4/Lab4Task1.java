import java.util.Arrays;
import java.util.Scanner;
public class Lab4Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 4;
        int[] array1 = new int[size], array2 = new int[size];
        System.out.println("Enter the First Array of Elements: ");
        for (int i = 0; i < size; i++) array1[i] = sc.nextInt();
        System.out.println("Enter the Second Array of Elements: ");
        for (int i = 0; i < size; i++) array2[i] = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("First Array: " + Arrays.toString(array1));
        System.out.println("Second Array: " + Arrays.toString(array2));
        for (int i = 0; i < size; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;}
        System.out.println("\nAfter Swapping");
        System.out.println("First Array: " + Arrays.toString(array1));
        System.out.println("Second Array: " + Arrays.toString(array2));}}