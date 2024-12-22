package khurramlab7hometask2;
public class KhurramLab7HomeTask2 {
    static class Node {
        int rollNumber;
        Node next;
        Node(int rollNumber) { this.rollNumber = rollNumber; }}
    static Node head = null;
    static void addStudent(int rollNumber) {
        Node newNode = new Node(rollNumber);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;}}
    static void deleteStudent(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) head = head.next;
        else {
            Node temp = head;
            while (temp.next != null && temp.next.rollNumber != rollNumber) temp = temp.next;
            if (temp.next != null) temp.next = temp.next.next;}}
    static void displayList() {
        if (head == null) System.out.println("No students in the list.");
        else {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.rollNumber + " ");}
            System.out.println();}}
    public static void main(String[] args) {
        addStudent(101);
        addStudent(102);
        addStudent(103);
        addStudent(104);
        System.out.println("Initial Student List:");
        displayList();
        deleteStudent(102);  
        System.out.println("After Deleting Roll Number 102:");
        displayList();}}