package lab3hometask4;
public class Lab3HomeTask4 {
    public static void main(String[] args) {
        int a = 48; // Example input
        int b = 18; // Example input
        int gcd = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}