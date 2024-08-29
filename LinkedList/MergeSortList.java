import mypackage.CustomLinkedList;
import mypackage.Node;

public class MergeSortList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
        list.addLast(3);

        CustomLinkedList sortedList = mergeSort(list.getHead(), list.getTail());
        sortedList.display();
    }

    public static CustomLinkedList mergeSort(Node head, Node tail) {
        if(head == tail) {
            CustomLinkedList baseList = new CustomLinkedList();
            baseList.addLast(head.data);
            return baseList;
        }

        Node middle = findMiddle(head, tail);
        CustomLinkedList list1 = mergeSort(head, middle);
        CustomLinkedList list2 = mergeSort(middle.next, tail);

        CustomLinkedList combinedList = mergeList(list1, list2);
        return combinedList;
    }

    public static Node findMiddle(Node head, Node tail) {
        Node fast = head;
        Node slow = head;

        while(fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static CustomLinkedList mergeList(CustomLinkedList list1, CustomLinkedList list2) {
        CustomLinkedList newList = new CustomLinkedList();
        Node pointerOne = list1.getHead();
        Node pointerTwo = list2.getHead();

        while(pointerOne != null && pointerTwo != null) {
            if(pointerOne.data < pointerTwo.data) {
                newList.addLast(pointerOne.data);
                pointerOne = pointerOne.next;
            } else {
                newList.addLast(pointerTwo.data);
                pointerTwo = pointerTwo.next;
            }
        }

        while(pointerOne != null) {
            newList.addLast(pointerOne.data);
            pointerOne = pointerOne.next;
        }
        while(pointerTwo != null) {
            newList.addLast(pointerTwo.data);
            pointerTwo = pointerTwo.next;
        }

        return newList;
    }
}