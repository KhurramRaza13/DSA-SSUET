import java.util.*;
public class KhurramLab6HomeTask1 {
    public static void binarySearch(int[] arr, int key) {
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                return;
            } else {
                last = mid - 1;}}
        System.out.println("Element is not found!");}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array (sorted): ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.print("Enter the key to find: ");
        int key = sc.nextInt();
        binarySearch(arr, key);}}