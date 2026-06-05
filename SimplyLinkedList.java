public class LinkedList {
    
    // The head acts as the starting point of the list
    private Node head;

    // 1. The Node Class
    // A static inner class is used to define the node structure.
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. Insert Method (Append to the end)
    public void append(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach the new node to the end
        current.next = newNode;
    }

    // 3. Display Method
    public void display() {
        Node current = head;
        
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    // 4. Main Method to test the code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        // Displaying the list
        list.display(); 
    }
}
