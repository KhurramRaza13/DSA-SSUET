package lab1hometask3;
public class Lab1HomeTask3 {
    public static void main(String[] args) {
        Double number = -16.0; // Autoboxing
        System.out.println("Absolute Value: " + Math.abs(number));
        if (number < 0) {
            System.out.println("Square Root: Undefined for negative numbers");
        } else {
            System.out.println("Square Root: " + Math.sqrt(number));
        }
        System.out.println("Power (2^4): " + Math.pow(2, 4));
    }
}