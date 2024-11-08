package lab3hometask1;
import java.util.HashMap;
public class Lab3HomeTask1 {
    private static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int n = 10; // Example input
        int fibonacciTerm = fibonacci(n);
        System.out.println("The " + n + "-th term in the Fibonacci series is: " + fibonacciTerm);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}