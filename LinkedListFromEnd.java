/**
 * Print Kth element from end of LinkedList
 * Recursive method: go to end, and print Kth element on recursion exit
 */

public class LinkedListFromEnd {

    static final int K = 1; // idx of element to print
    static int idx = 0;

    public static void main(String[] args) {
        // Init linked list
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(new MyLinkedList.Node(1));
        linkedList.add(new MyLinkedList.Node(2));
        linkedList.add(new MyLinkedList.Node(3));
        System.out.println(linkedList);
        // Recursive list iteration
        listDiver(linkedList.head); // will print 2
    }

    public static void listDiver(MyLinkedList.Node node) {
        // Dive till end
        if (node.next() != null) {
            listDiver(node.next());
        }
        // Recursion exit
        if (idx == K) {
            System.out.println("Kth element from end = " + node.getData());
        }
        idx++;
        return;
    }

}
