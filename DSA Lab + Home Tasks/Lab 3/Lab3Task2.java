package lab3task2;
public class Lab3Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = reverseString(str);
        System.out.println("The Reverse String is: " + reversed);
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}