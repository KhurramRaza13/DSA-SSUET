package lab3task5;
public class Lab3Task5 {
    public static void main(String[] args) {
        int n = 5; // Example input
        int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}