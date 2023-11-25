class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Traversing the linked list
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
