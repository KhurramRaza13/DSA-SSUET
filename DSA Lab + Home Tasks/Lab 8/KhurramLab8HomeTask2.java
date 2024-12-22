package khurramlab8hometask2;
import java.util.*;
public class KhurramLab8HomeTask2 {
    static class Deque {
        static class Node {
            int data;
            Node prev, next;
            Node(int data) { this.data = data; }}
        Node front, rear;
        int size;
        Deque() { front = rear = null; size = 0; }
        boolean isEmpty() { return front == null; }
        int size() { return size; }
        void insertFront(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) front = rear = newNode;
            else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;}
            size++;}
        void insertRear(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) front = rear = newNode;
            else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;}
            size++;}
        void deleteFront() {
            if (isEmpty()) System.out.println("UnderFlow");
            else {
                front = front.next;
                if (front == null) rear = null;
                else front.prev = null;
                size--;}}
        void deleteRear() {
            if (isEmpty()) System.out.println("UnderFlow");
            else {
                rear = rear.prev;
                if (rear == null) front = null;
                else rear.next = null;
                size--;}}
        int getFront() { return isEmpty() ? -1 : front.data; }
        int getRear() { return isEmpty() ? -1 : rear.data; }
        void erase() { front = rear = null; size = 0; }}
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertRear(5);
        dq.insertRear(10);
        System.out.println("Rear end element: " + dq.getRear());
        dq.deleteRear();
        System.out.println("After deleting rear element new rear is: " + dq.getRear());
        dq.insertFront(15);
        System.out.println("Front end element: " + dq.getFront());
        System.out.println("Number of elements in Deque: " + dq.size());
        dq.deleteFront();
        System.out.println("After deleting front element new front is: " + dq.getFront());}}