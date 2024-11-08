package lab2task5;
import java.util.*;
public class Lab2Task5 {
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 3, 5, 7, 9);
        int k = 3;
        System.out.println(k > 0 && k <= sortedList.size() 
            ? "The " + k + "-th smallest element is: " + sortedList.get(k - 1) 
            : "k is out of bounds");
    }
}