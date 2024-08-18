import mypackage.CustomLinkedList;
import mypackage.Node;

public class ReverseLinkedListPointer {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        // reverseListIterative(list.getHead());

        reverseListRecursive(list.getHead(), list.getTail());
        Node head = list.getHead();
        head.next = null;
        list.setHead(head);

        // Swap head and tail
        Node currHead = list.getHead();
        Node currTail = list.getTail();
        list.setHead(currTail);
        list.setTail(currHead);

        list.display();
    }

    public static void reverseListIterative(Node node) {
        Node prev = null;
        Node curr = node;

        while(curr != null) {
            Node currNext = curr.next;

            curr.next = prev;
            
            prev = curr;
            curr = currNext;
        }
    }

    public static void reverseListRecursive(Node node, Node tail) {
        if(node == null) {
            return;
        }

        reverseListRecursive(node.next, tail);

        if(node != tail) {
            node.next.next = node;
        }
    }
}