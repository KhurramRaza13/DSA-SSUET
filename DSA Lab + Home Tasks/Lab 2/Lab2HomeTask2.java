package lab2hometask2;
import java.util.Scanner;
public class Lab2HomeTask2 {
    public static void main(String[] args) {
    String s;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Anything: ");
    s = input.nextLine();
    System.out.println("hashCode: "+s.hashCode());
    } 
}