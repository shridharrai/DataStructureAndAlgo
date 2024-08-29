import mypackage.CustomLinkedList;
import mypackage.Node;

public class KthElementFromEnd {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        int k = 2;

        int data = getKthElement(list, k);
        System.out.println(data);
    }

    public static int getKthElement(CustomLinkedList list, int k) {
        Node head = list.getHead();
        Node tail = list.getTail();
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; ++i) {
            fast = fast.next;
        }

        while(fast != tail) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }
}