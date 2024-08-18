import mypackage.CustomLinkedList;
import mypackage.Node;

public class ReverseLinkedListData {
    static Node left;

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        // reverseListIterative(list);
        left = list.getHead();
        reverseListRecursive(list.getHead(), 0, list.size());

        list.display();
    }

    // O(n2)
    public static void reverseListIterative(CustomLinkedList list) {
        int startPointer = 0;
        int endPointer = list.size() - 1;

        while(startPointer < endPointer) {
            Node startNode = getNodeAt(startPointer, list);
            Node endNode = getNodeAt(endPointer, list);

            int tempData = startNode.data;
            startNode.data = endNode.data;
            endNode.data = tempData;

            startPointer++;
            endPointer--;
        }
    }

    public static Node getNodeAt(int idx, CustomLinkedList list) {
        Node temp = list.getHead();

        for(int i = 0; i < idx; ++i) {
            temp = temp.next;
        }

        return temp;
    }

    // O(n)
    public static void reverseListRecursive(Node right, int floor, int size) {
        if(right == null) {
            return;
        }

        reverseListRecursive(right.next, floor + 1, size);

        if(floor >= size / 2) {
            int tempData = right.data;
            right.data = left.data;
            left.data = tempData;
        }
        left = left.next;
    }
}