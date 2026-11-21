package TerminalProjects.DSA;

public class SinglyLinkedList {
    static class LinkedList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Insert at the beginning
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Print the list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.display(); // Output: 30 -> 20 -> 10 -> null
    }
}
