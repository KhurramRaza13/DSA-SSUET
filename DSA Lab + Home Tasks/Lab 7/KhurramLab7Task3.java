package khurramlab7task3;
import java.util.LinkedList;
public class KhurramLab7Task3 {
    public static void main(String[] args) {
        LinkedList<String> fruitsList = new LinkedList<>();
        System.out.println(fruitsList.isEmpty() ? "LinkedList is empty" : "LinkedList is NOT empty");
        fruitsList.add("APPLE");
        System.out.println(fruitsList.size());
        System.out.println(fruitsList.isEmpty() ? "LinkedList is empty" : "LinkedList is NOT empty");}}