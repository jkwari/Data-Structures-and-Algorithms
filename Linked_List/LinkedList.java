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

    // Detect Cycle Using Floyd's Algorithm
    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public int nthNodeFromStart(int number) {
        // If the list is empty
        if (head == null) {
            return -1;
        }
        // If we have nodes we do look for the node data at a certain index;
        Node curr = head;
        int index = 1;
        while (curr != null) {
            if (index == number) {
                return curr.data;

            }
            curr = curr.next;
            index++;

        }
        return -1;
    }

    public int nthNodeFromEnd(int number) {
        if (head == null) {
            return -1; // the list is empty
        }
        Node curr = head;
        // since we are doing the search from the end we need to know the length
        int length = 0;
        // This loop is counting;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i < length; i++) {
            curr = curr.next;
        }

        return curr.data;

    }

    public int countNodes() {
        // First we need to check if the list is empty or not
        if (head == null) {
            return -1;
        }
        // we need to initialize an int count
        int count = 0;

        // we need a curr node
        Node curr = head;

        // we need to make loop until we reach null
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // return the count
        return count;

    }

    public void sortedTwoLists(LinkedList list) {
        // Checking if both list are empty
        if (head == null && list.head == null) {
            return;
        }
        // Here is what i think we need to do:
        // 1. i think we need to sort each list seperatly.
        // 2. then we start the comparison between two lists and decide who
        // comes first.
        // 3. based on the comparison we start pupolating the new list with our sorted list

        // 


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
