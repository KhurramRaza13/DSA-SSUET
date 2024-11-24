import java.util.Arrays;
public class KhurramLab6Task3 {
    public static int findSmallestMissing(int[] arr) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= 0 || arr[mid] != mid + 1) right = mid - 1;
            else left = mid + 1;}
        return left + 1;}
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest Missing Positive: " + findSmallestMissing(arr));}}