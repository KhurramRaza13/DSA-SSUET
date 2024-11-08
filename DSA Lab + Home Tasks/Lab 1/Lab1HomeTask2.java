package lab1hometask2;
public class Lab1HomeTask2 {
    public static void main(String[] args) {
        int number = 1234567890;
        countEvenOddDigits(number);
    }
    public static void countEvenOddDigits(int num) {
        Integer numObj = num;
        int evenCount = 0, oddCount = 0;
        while (numObj > 0) {
            int digit = numObj % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            numObj /= 10;
        }
        System.out.println("Even Digits Count: " + evenCount);
        System.out.println("Odd Digits Count: " + oddCount);
    }
}