import java.util.Scanner;
public class Lab5Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at position '" + i + "': ");
            array[i] = scan.nextInt();}
        selectionSort(array);
        scan.close();}
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int low = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[low]) low = j;}
            int temp = array[i]; array[i] = array[low]; array[low] = temp;}
        for (int element : array) System.out.print(element + ", ");
        System.out.println();}}