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

    public boolean deleteFromBeginning() {
        if (head == null) {
            return false;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return true;
        }
    }

    public boolean deleteFromEnd() {
        if (head == null) {
            return false;
        } else {
            Node current = head;
            Node temp = head;
            while (current.next != null) {
                current = current.next;
            }

            while (temp.next != current) {
                temp = temp.next;
            }
            temp.next = null;
            return true;

        }
    }

    public boolean deleteNode(int data) {
        if (head == null) {
            return false; // List is Empty
        } else {
            Node current = head.next;
            Node temp = head;

            while (current != null) {
                if (current.data == data) {
                    temp.next = current.next;
                    current.next = null;
                    return true; // found
                }
                current = current.next;
                temp = temp.next;
            }

        }
        return false; // Not Found
    }

    public boolean searchForNode(int data) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverseList() {
        Node curr, prev, next;
        prev = null;
        next = null;
        curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public int findMiddleNode() {
        if (head == null) {
            return -1;
        }
        Node curr = head;
        int counter = 0;
        while (curr != null) {
            counter++;
            curr = curr.next;
        }
        // to find the middle index we need to divide the counter by 2
        int middle = counter / 2;
        curr = head;

        int i = 0;
        while (curr != null) {
            if (i == middle) {
                return curr.data;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    // Two pointer solution(Fast/Slow)
    public int findMiddleNodeOptimized() {
        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
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
