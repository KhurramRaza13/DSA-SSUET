public class Lab4HomeTask4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5};
        System.out.println("Missing number: " + findMissingNumber(arr));}
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;}
        return expectedSum - actualSum;}}