package lab3hometask3;
public class Lab3HomeTask3 {
    public static void main(String[] args) {
        String str = "madam"; // Example input
        System.out.println(isPalindrome(str) ? "YES" : "NO");
    }
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0);
    }
    private static boolean isPalindromeHelper(String str, int left) {
        int right = str.length() - 1 - left;
        return left >= right || (str.charAt(left) == str.charAt(right) && isPalindromeHelper(str, left + 1));
    }
}