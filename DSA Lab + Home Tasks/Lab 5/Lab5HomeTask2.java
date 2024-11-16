import java.util.*;
public class Lab5HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements of array: ");
        for (int i = 0; i < size; arr[i++] = sc.nextInt());
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting using mergesort algorithm: " + Arrays.toString(arr));}
    private static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);}}
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int i = 0, left = start, right = mid + 1;
        while (left <= mid && right <= end) {
            tmp[i++] = arr[left] < arr[right] ? arr[left++] : arr[right++];}
        while (left <= mid) tmp[i++] = arr[left++];
        while (right <= end) tmp[i++] = arr[right++];
        System.arraycopy(tmp, 0, arr, start, tmp.length);}}