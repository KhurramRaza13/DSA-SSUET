package lab1hometask1;
public class Lab1HomeTask1 {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // autoboxing
        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer Value: " + Integer.MIN_VALUE);
        System.out.println("Parsed Integer from String: " + Integer.valueOf("123"));
        System.out.println("Integer to String: " + Integer.toString(wrappedInt));
        System.out.println("Integer Comparison: " + wrappedInt.compareTo(15));}}