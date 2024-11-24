package lab6task4;
public class KhurramLab6Task4 {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;}
        return result;}
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println("First Occurrence of " + target + ": " + findFirstOccurrence(arr, target));}}