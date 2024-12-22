package khurramlab8hometask3;
public class KhurramLab8HomeTask3 {
    static class DoublyLinkedList {
        static class Node {
            int songID;
            String songTitle;
            Node prev, next;
            Node(int id, String title) {
                songID = id;
                songTitle = title;}}
        private Node head, tail;
        public void insertAtEnd(int id, String title) {
            Node newNode = new Node(id, title);
            if (tail == null) head = tail = newNode;
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;}}
        public void displayPlaylist() {
            for (Node current = head; current != null; current = current.next)
                System.out.println("ID: " + current.songID + ", Title: " + current.songTitle);}
        public void reverseAndDisplayPlaylist() {
            for (Node current = tail; current != null; current = current.prev)
                System.out.println("ID: " + current.songID + ", Title: " + current.songTitle);}}
    public static void main(String[] args) {
        DoublyLinkedList playlist = new DoublyLinkedList();
        playlist.insertAtEnd(1, "All The Stars");
        playlist.insertAtEnd(2, "Dream On");
        playlist.insertAtEnd(3, "Lights Out");
        System.out.println("Playlist from start to end:");
        playlist.displayPlaylist();
        System.out.println("\nReversed playlist:");
        playlist.reverseAndDisplayPlaylist();}}