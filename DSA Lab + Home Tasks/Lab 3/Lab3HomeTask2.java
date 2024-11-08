package lab3hometask2;
public class Lab3HomeTask2 {
    public static void main(String[] args) {
        int number = 12345; // Example input
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + count);
    }
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
}