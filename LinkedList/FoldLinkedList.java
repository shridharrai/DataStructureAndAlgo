import mypackage.CustomLinkedList;
import mypackage.Node;

public class FoldLinkedList {
    static Node left;

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        left = list.getHead();
        foldList(list.getHead(), 0, list.size(), list);

        System.out.println(list.size());
        list.display();
        list.addLast(6);
        System.out.println(list.size());
        list.display();
    }

    public static void foldList(Node right, int floor, int size, CustomLinkedList list) {
        if(right == null) {
            return;
        }

        foldList(right.next, floor + 1, size, list);

        if(floor > size / 2) {
            Node temp = left.next;
            left.next = right;
            right.next = temp;

            left = temp;
        } else if(floor == size / 2) {
            right.next = null;
            list.setTail(right);
        }
    }
}