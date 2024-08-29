import mypackage.CustomLinkedList;
import mypackage.Node;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        int data = findMiddle(list);
        System.out.println(data);
    }

    public static int findMiddle(CustomLinkedList list) {
        Node head = list.getHead();
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }
}