import java.util.*;
public class Lab5HomeTask3{
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);}}
    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);}
    static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);}}
    static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) temp[k++] = arr[i].compareTo(arr[j]) <= 0 ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);}
    public static void main(String[] args) {
        int[] intArray = {55, 66, 44, 33, 22, 11, 77, 88, 99};
        mergeSort(intArray, 0, intArray.length - 1);
        System.out.println("Sorted integers: " + Arrays.toString(intArray));
        String[] stringArray = {"My Name is Khurram Raza","I'm CR of Section A Batch 2023F 3rd Semester"};
        mergeSort(stringArray, 0, stringArray.length - 1);
        System.out.println("Sorted strings: " + Arrays.toString(stringArray));}}