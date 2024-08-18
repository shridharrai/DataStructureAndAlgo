import mypackage.CustomLinkedList;
import mypackage.Node;

public class DisplayReverse {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        displayReverse(list.getHead());
    }

    public static void displayReverse(Node node) {
        if(node == null) {
            return;
        }

        displayReverse(node.next);
        System.out.print(node.data + " ");
    }
}