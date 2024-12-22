package khurramlab8hometask1;
public class KhurramLab8HomeTask1 {
    static class SortList {
        static class Node {
            int data;
            Node next;
            Node(int data) { this.data = data; }}
        Node head, tail;
        void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }}
        void sortList() {
            if (head == null) return;
            Node current = head;
            while (current != null) {
                Node index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;}
                    index = index.next;}
                current = current.next;}}
        void display() {
            if (head == null) { System.out.println("List is empty"); return; }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;}
            System.out.println();}}
    public static void main(String[] args) {
        SortList sList = new SortList();
        sList.addNode(8);
        sList.addNode(3);
        sList.addNode(7);
        sList.addNode(4);
        System.out.println("Original Unsorted list: ");
        sList.display();
        sList.sortList();
        System.out.println("Sorted list: ");
        sList.display();}}