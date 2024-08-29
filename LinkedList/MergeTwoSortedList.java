import mypackage.CustomLinkedList;
import mypackage.Node;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        CustomLinkedList list2 = new CustomLinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        CustomLinkedList mergedList = mergeSortedList(list1, list2);
        mergedList.display();
    }

    public static CustomLinkedList mergeSortedList(CustomLinkedList list1, CustomLinkedList list2) {
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