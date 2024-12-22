import java.util.Scanner;
public class KhurramLab7Task1 {
    static class LinkedList {
        static class Node {
            String studentName;
            int age, id;
            Node next;
            Node(String name, int age, int id) { this.studentName = name; this.age = age; this.id = id; }}
        private Node head, tail;
        void addNode(String name, int age, int id) {
            Node newNode = new Node(name, age, id);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }}
        void display() {
            if (head == null) { System.out.println("List is empty."); return; }
            Node current = head; int counter = 1;
            while (current != null) {
                System.out.printf("\tSTUDENT %d\n\t===========\nName: %s\nAge: %d\nId: %d\n", counter++, current.studentName, current.age, current.id);
                current = current.next;}}
        void insertAt(int index, String name, int age, int id) {
            Node newNode = new Node(name, age, id);
            if (index == 0) { newNode.next = head; head = newNode; if (tail == null) tail = newNode; return; }
            Node current = head; int counter = 0;
            while (current != null && counter++ < index - 1) current = current.next;
            if (current != null) {
                newNode.next = current.next; current.next = newNode;
                if (newNode.next == null) tail = newNode;
            } else System.out.println("Index out of bounds.");}
        void search(String name) {
            Node current = head; int pos = 1;
            while (current != null) {
                if (current.studentName.equalsIgnoreCase(name)) {
                    System.out.println(name + " found at position: " + pos);
                    return;}
                current = current.next; pos++;}
            System.out.println("Student not found.");}
        void deleteAt(int index) {
            if (head == null) { System.out.println("List is empty."); return; }
            if (index == 0) { head = head.next; if (head == null) tail = null; return; }
            Node current = head; int counter = 0;
            while (current != null && counter++ < index - 1) current = current.next;
            if (current != null && current.next != null) {
                current.next = current.next.next;
                if (current.next == null) tail = current;
            } else System.out.println("Index out of bounds.");}}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Displaying Students Information of linked list");
        System.out.println("==============================================");
        System.out.println("Enter Records of 10 Students:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("STUDENT " + i + ":\nEnter Name, Age, and Id:");
            list.addNode(sc.next(), sc.nextInt(), sc.nextInt());}
        list.display();
        System.out.println("\nInsertion at index position ");
        System.out.println("==============================");
        System.out.println("Enter Position, Name, Age, Id:");
        list.insertAt(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
        list.display();
        System.out.println("\nSearching Student");
        System.out.println("==================");
        System.out.println("Enter the name of the student you want to search:");
        list.search(sc.next());
        System.out.println("\nDeletion at position ");
        System.out.println("======================");
        System.out.println("Enter the position of the student you want to delete:");
        list.deleteAt(sc.nextInt());
        list.display();}}