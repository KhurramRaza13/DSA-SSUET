package khurramlab7task2;
public class KhurramLab7Task2 {
    public static void main(String[] args) {
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();
        llist1.add(5, 10, 15);
        llist2.add(2, 3, 20);
        llist1.head = new Gfg().sortedMerge(llist1.head, llist2.head);
        System.out.println("Merged Linked List is:");
        llist1.printList();}}
class Node {
    int data;
    Node next;
    Node(int d) { data = d; }}
class MergeLists {
    Node head;
    void add(int... values) {
        for (int val : values) addToLast(new Node(val));}
    void addToLast(Node node) {
        if (head == null) head = node;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;}}
    void printList() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();}}
class Gfg {
    Node sortedMerge(Node headA, Node headB) {
        Node dummyNode = new Node(0), tail = dummyNode;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                tail.next = headA; headA = headA.next;
            } else {
                tail.next = headB; headB = headB.next;}
            tail = tail.next;}
        tail.next = (headA != null) ? headA : headB;
        return dummyNode.next;}}