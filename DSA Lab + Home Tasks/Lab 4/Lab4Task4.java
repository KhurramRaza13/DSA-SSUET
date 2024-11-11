public class Lab4Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int evens = 0, odds = 0;
        for (int num : numbers) {
            if (num % 2 == 0) evens++;
            else odds++;}
        System.out.println("Even count: " + evens);
        System.out.println("Odd count: " + odds);}}