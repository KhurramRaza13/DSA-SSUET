package khurramlab7task4;
public class KhurramLab7Task4 {
    static class SinglyLinkedList {
        static class Node {
            int data;
            Node next;
            Node(int data) { this.data = data; }}
        private Node head;
        void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;}
        void display() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;}
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");}
            System.out.println();}
        int findMiddle() {
            if (head == null) throw new IllegalStateException("The list is empty.");
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;}
            return slow.data;}}
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.display();
        System.out.println("The middle element is: " + list.findMiddle());}}