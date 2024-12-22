package khurramlab8task3;
import java.util.Scanner;
public class KhurramLab8Task3 {
    static class Book {
        int id;
        String title;
        Book next, prev;
        Book(int id, String title) {
            this.id = id;
            this.title = title;}}
    static class DoublyLinkedList {
        Book head, tail;
        void insertAtFirst(int id, String title) {
            Book newBook = new Book(id, title);
            if (head == null) head = tail = newBook;
            else {
                newBook.next = head;
                head.prev = newBook;
                head = newBook;}}
        void display() {
            Book current = head;
            while (current != null) {
                System.out.println("ID: " + current.id + ", Title: " + current.title);
                current = current.next;}}
        void deleteById(int id) {
            Book current = head;
            while (current != null) {
                if (current.id == id) {
                    if (current.prev != null) current.prev.next = current.next;
                    if (current.next != null) current.next.prev = current.prev;
                    if (current == head) head = current.next;
                    if (current == tail) tail = current.prev;
                    return;}
                current = current.next;}
            System.out.println("Book with ID " + id + " not found.");}}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList library = new DoublyLinkedList();
        System.out.print("Enter number of books to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            library.insertAtFirst(id, title);}
        System.out.println("\nBooks in the library:");
        library.display();
        System.out.print("\nEnter Book ID to delete: ");
        int idToDelete = scanner.nextInt();
        library.deleteById(idToDelete);
        System.out.println("\nBooks in the library after deletion:");
        library.display();
        scanner.close();}}