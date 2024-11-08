import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;
public class Lab2HomeTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> integers = new Vector<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            integers.add(input.nextInt());
        }
        Collections.sort(integers);
        System.out.println("Elements: " + integers);
        System.out.println("Maximum number: " + integers.lastElement());
        System.out.println("Minimum number: " + integers.firstElement());
        input.close();
    }
}