import java.util.*;
public class KhurramLab6HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);}
        System.out.println("The Array: " + frequencyMap.keySet());
        frequencyMap.forEach((key, count) -> System.out.println(key + " occurs " + count + " times"));}}