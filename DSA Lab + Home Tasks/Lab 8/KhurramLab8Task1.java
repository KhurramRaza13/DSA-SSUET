public class KhurramLab8Task1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(10, "Khurram");
        list.addNode(20, "Malaika");
        list.addNode(30, "Wasif");
        list.addNode(40, "Maaz");
        list.addNode(50, "Saqib");
        list.addNodeStart(2, "Jazbia");
        list.insertAt(4, 0, "Bia");
        list.printNodes();}
    static class Node {
        int id;
        String name;
        Node previous, next;
        Node(int id, String name) { this.id = id; this.name = name; }}
    static class LinkedList {
        Node head, tail;
        void addNode(int id, String name) {
            Node newNode = new Node(id, name);
            if (tail == null) head = tail = newNode;
            else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;}}
        void addNodeStart(int id, String name) {
            Node newNode = new Node(id, name);
            if (head == null) head = tail = newNode;
            else {
                newNode.next = head;
                head.previous = newNode;
                head = newNode;}}
        void insertAt(int pos, int id, String name) {
            if (pos < 1) return;
            Node newNode = new Node(id, name);
            if (pos == 1) {
                newNode.next = head;
                if (head != null) head.previous = newNode;
                head = newNode;
                return;}
            Node temp = head;
            for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
            if (temp != null) {
                newNode.next = temp.next;
                newNode.previous = temp;
                if (temp.next != null) temp.next.previous = newNode;
                temp.next = newNode;}}
        void printNodes() {
            if (head == null) {
                System.out.println("Doubly linked list is empty.");
                return;}
            System.out.println("Nodes of doubly linked list:");
            for (Node current = head; current != null; current = current.next)
                System.out.println("name: " + current.name + " | id: " + current.id);}}}