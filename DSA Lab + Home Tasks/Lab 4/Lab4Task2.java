import java.util.Scanner;
public class Lab4Task2 {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];}
        for (int j = 0; j < array2.length; j++) {
            mergedArray[array1.length + j] = array2[j];}
        return mergedArray;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();}
        int[] b = {5, 16, 1, 2, 3, 22};
        int[] mergedArray = mergeArrays(a, b);
        System.out.println("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");}}}