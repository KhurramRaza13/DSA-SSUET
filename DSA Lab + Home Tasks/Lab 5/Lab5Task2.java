import java.util.Scanner;
public class Lab5Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] array = new int[scan.nextInt()]; 
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at position '" + i + "': ");
            array[i] = scan.nextInt();}
        bubbleSort(array);
        scan.close();}
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;}}
            System.out.print("array[] = ");
            for (int k : array) System.out.print(k + ", ");
            System.out.println();}}}