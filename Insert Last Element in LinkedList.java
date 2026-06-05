class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Insertlast {

    static Node insertAtLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        for (; temp.next != null; temp = temp.next) {
        }

        temp.next = newNode;

        return head;
    }

    static void printList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertAtLast(head, 50);

        printList(head);
    }
}
