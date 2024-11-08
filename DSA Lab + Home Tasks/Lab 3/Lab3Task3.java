package lab3task3;
import java.util.Scanner;
public class Lab3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Total is: " + recurSum(n));
    }
    public static int recurSum(int n) {
        if (n <= 1) {
            return n;
        } else {
            System.out.println(n);
        }
        return n + recurSum(n - 1);
    }
}