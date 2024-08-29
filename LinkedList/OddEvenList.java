import mypackage.CustomLinkedList;
import mypackage.Node;

public class OddEvenList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(2);
        list.addLast(9);
        list.addLast(7);
        list.addLast(8);
        list.addLast(1);
        list.addLast(6);
        list.addLast(5);
        list.addLast(4);

        CustomLinkedList newList = makeList(list);
        newList.display();
        System.out.println(newList.size());
    }

    public static CustomLinkedList makeList(CustomLinkedList list) {
        CustomLinkedList oddList = new CustomLinkedList();
        CustomLinkedList evenList = new CustomLinkedList();

        while(list.size() > 0) {
            int data = list.removeFirst();
            
            if(data % 2 == 0) {
                evenList.addLast(data);
            } else {
                oddList.addLast(data);
            }
        }

        if(oddList.size() > 0 && evenList.size() > 0) {
            oddList.getTail().next = evenList.getHead();
            oddList.setTail(evenList.getTail());
            oddList.setSize(oddList.size() + evenList.size());
            return oddList;
        } else if(oddList.size() > 0) {
            return oddList;
        } else {
            return evenList;
        }
    }
}