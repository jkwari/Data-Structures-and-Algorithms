package Linked_List;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void insertNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        // that the list is empty so insert it at the beginning
        if (head == null) {
            head = newNode;
            return;
        }
        // We have Nodes in the list and we need to traverse to the last node
        // using current pointer;

        // So assign current to head
        Node current = head;

        // And Now start looping until current.next = null;
        // Since we don't know how many nodes are in the list it safe to use
        // while loop because we don't know how many times we will loop

        // This loops means that keep looping till the last node in the list.
        // the last node its next is null
        while (current.next != null) {
            current = current.next;
        }
        // Our loop helped us reach the last node which its next is null so we
        // can safely say current.next equals our new node that we want to insert
        // at the end.
        current.next = newNode;
    }

    public void insertAfterExistingNode(Node prevNode, int data) {
        // edge case it can't be null
        if (prevNode == null) {
            return;
        }
        Node newNode = new Node(data);
        // Assign the newNode.next to the node that prevNode.next
        newNode.next = prevNode.next;
        // then assign prevNode.next to our newNode
        prevNode.next = newNode;
    }

    public void displayList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        // So we wont print multiple lists next to each other
        System.out.println();
    }

}
