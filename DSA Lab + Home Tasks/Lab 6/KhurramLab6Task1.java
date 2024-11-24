import java.util.Scanner;
public class KhurramLab6Task1 {
    public static void main(String[] args) {
        int balance = 10000;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] < balance) 
                System.out.println("Account " + (i + 1) + " has low balance.");
        sc.close();}}