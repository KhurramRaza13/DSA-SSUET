package lab2task4;
import java.util.*;
public class Lab2Task4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 10; i <= 100; i += 10) vector.add(i);
        System.out.println("Vector elements: " + vector);
        System.out.println("Sum of elements: " + vector.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Maximum element: " + Collections.max(vector));
    }
}