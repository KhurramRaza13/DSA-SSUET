import java.util.Scanner;
public class KhurramLab7HomeTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter Records of 10 Employees:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("EMPLOYEE " + i + ":");
            list.addNode(sc.next(), sc.nextInt(), sc.nextInt());}
        list.display();
        System.out.println("\nInsertion at index position:");
        list.insertAt(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
        list.display();
        System.out.println("\nDeletion at position:");
        list.deleteAt(sc.nextInt());}
    static class LinkedList {
        class Node {
            String name;
            int age, salary;
            Node next;
            Node(String name, int age, int salary) { this.name = name; this.age = age; this.salary = salary; }}
        private Node head = null;
        void addNode(String name, int age, int salary) {
            Node newNode = new Node(name, age, salary);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;}}
        void display() {
            if (head == null) { System.out.println("List is empty"); return; }
            Node current = head;
            int counter = 1;
            while (current != null) {
                System.out.printf("\tEMPLOYEE %d\n\t===========\nName: %s\nAge: %d\nSalary: %d\n", counter++, current.name, current.age, current.salary);
                current = current.next;}}
        void insertAt(int index, String name, int age, int salary) {
            if (index < 1) { System.out.println("Invalid index."); return; }
            Node newNode = new Node(name, age, salary);
            if (index == 1) { newNode.next = head; head = newNode; return; }
            Node current = head;
            for (int i = 1; current != null && i < index - 1; i++) current = current.next;
            if (current == null) { System.out.println("Index out of bounds."); return; }
            newNode.next = current.next;
            current.next = newNode;}
        void deleteAt(int index) {
            if (index < 1 || head == null) { System.out.println("Invalid index or empty list."); return; }
            if (index == 1) { head = head.next; return; }
            Node current = head;
            for (int i = 1; current != null && i < index - 1; i++) current = current.next;
            if (current == null || current.next == null) { System.out.println("Index out of bounds."); return; }
            current.next = current.next.next;}}}