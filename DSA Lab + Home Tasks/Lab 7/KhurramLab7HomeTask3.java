package khurramlab7hometask3;
public class KhurramLab7HomeTask3 {
    static class Node {
        int rollNumber;
        Node next, prev;
        Node(int rollNumber) { this.rollNumber = rollNumber; }}
    static class StudentGroupManagement {
        Node head1 = null, head2 = null;
        void addStudentToGroup(Node head, int rollNumber) {
            Node newNode = new Node(rollNumber);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
                newNode.prev = temp;}}
        void appendLists() {
            if (head1 == null) head1 = head2;
            else {
                Node temp = head1;
                while (temp.next != null) temp = temp.next;
                temp.next = head2;
                if (head2 != null) head2.prev = temp;}}
        int countStudents() {
            int count = 0;
            for (Node temp = head1; temp != null; temp = temp.next) count++;
            return count;}
        void displayList(Node head) {
            if (head == null) {
                System.out.println("List is empty.");
                return;}
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.rollNumber + " ");}
            System.out.println();}}
    public static void main(String[] args) {
        StudentGroupManagement manager = new StudentGroupManagement();
        manager.addStudentToGroup(manager.head1, 101);
        manager.addStudentToGroup(manager.head1, 102);
        manager.addStudentToGroup(manager.head1, 103);
        manager.addStudentToGroup(manager.head2, 201);
        manager.addStudentToGroup(manager.head2, 202);
        System.out.println("Group 1:");
        manager.displayList(manager.head1);
        System.out.println("Group 2:");
        manager.displayList(manager.head2);
        manager.appendLists();
        System.out.println("Final List after Append:");
        manager.displayList(manager.head1);
        System.out.println("Total number of students: " + manager.countStudents());}}