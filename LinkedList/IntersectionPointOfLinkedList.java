import mypackage.CustomLinkedList;
import mypackage.Node;

public class IntersectionPointOfLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.addLast(4);
        list1.addLast(2);
        list1.addLast(8);
        list1.addLast(4);
        list1.addLast(5);
        CustomLinkedList list2 = new CustomLinkedList();
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(1);
        list2.addLast(8);
        list2.addLast(4);
        list2.addLast(5);

        int res = findIntersection(list1, list2);
        System.out.println(res);
    }

    public static int findIntersection(CustomLinkedList list1, CustomLinkedList list2) {
        int list1Size = list1.size();
        int list2Size = list2.size();
        int delta = Math.abs(list1Size - list2Size);
        Node head1 = list1.getHead();
        Node head2 = list2.getHead();

        if(list1Size > list2Size) {
            for(int i = 0; i < delta; ++i) {
                head1 = head1.next;
            }
        } else if(list2Size > list1Size) {
            for(int i = 0; i < delta; ++i) {
                head2 = head2.next;
            }
        }

        while(head1.data != head2.data) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1.data;
    }
}