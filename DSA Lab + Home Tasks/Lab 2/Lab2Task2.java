package lab2task2;
import java.util.*;
public class Lab2Task2 {
    public static void main(String[] args) { 
        List<String> alist = Arrays.asList("A", "B", "C", "D", "E", "F");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice between a or b: ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("a")) {
            System.out.println(alist);
        } else if (choice.equalsIgnoreCase("b")) {
            String largest = Collections.max(alist, Comparator.comparingInt(String::length));
            System.out.println("Largest element: " + largest);
        } else {
            System.out.println("Choose Between A or B!");
        }
        sc.close();
    }
}