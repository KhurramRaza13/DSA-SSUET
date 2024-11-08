package lab2task1;
import java.util.*;
public class Lab2Task1 {
public static void main(String[] args) { 
    int sum = 0;
    Vector <Integer> vector = new Vector < Integer > ();
    vector.add(1);
    vector.add(10);
    vector.add(2);
    vector.add(9);
    vector.add(3);
    vector.add(8);
    vector.add(4);
    vector.add(7);
    vector.add(5);
    vector.add(6);
    System.out.println(vector);
    for (Integer x: vector) {
        sum += x;
    }
    System.out.println("Sum of all elements: " + sum);
  }
}