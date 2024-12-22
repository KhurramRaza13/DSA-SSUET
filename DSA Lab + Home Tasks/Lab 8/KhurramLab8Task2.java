package khurramlab8task2;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class KhurramLab8Task2 {
    static class Student {
        int id;
        String name;
        Student(int id, String name) {
            this.id = id;
            this.name = name;}
        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name;}}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Student> studentDeque = new LinkedList<>();
        System.out.print("Enter the number of students to insert: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter ID for student " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentDeque.addLast(new Student(id, scanner.nextLine()));}
        System.out.print("Enter ID for the student at the beginning: ");
        int firstId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name for the student at the beginning: ");
        studentDeque.addFirst(new Student(firstId, scanner.nextLine()));
        System.out.print("Enter ID for the student at the end: ");
        int lastId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name for the student at the end: ");
        studentDeque.addLast(new Student(lastId, scanner.nextLine()));
        studentDeque.forEach(System.out::println);
        scanner.close();}}