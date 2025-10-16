package Linked_List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello To LinkedList");
        LinkedList list1 = new LinkedList();
        list1.insertNodeAtBeginning(5);
        list1.insertNodeAtEnd(9);
        list1.insertNodeAtEnd(24);
        list1.insertNodeAtEnd(48);
        list1.insertNodeAtEnd(88);

        // System.out.println(list1.deleteFromBeginning());
        System.out.println(list1.searchForNode(88));
        list1.reverseList();
        list1.displayList();
        // list1.displayList();
    }
}
