import java.util.Scanner;
public class KhurramLab6Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Search an element: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                System.out.println("Required element " + search + " found at position " + i);
                found = true;
                break;}}
        if (!found) System.out.println("Element " + search + " not found in the array.");
        sc.close();}}