import java.util.*;
public class Lab5HomeTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; arr[i++] = sc.nextInt()) {
            System.out.print("Enter the balance: ");}
        quickSort(arr, 0, arr.length - 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("Account No %d Balance: %d%n", i + 1, arr[i]);}}
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);}}
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, ++i, j);}}
        swap(arr, i + 1, high);
        return i + 1;}
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;}}