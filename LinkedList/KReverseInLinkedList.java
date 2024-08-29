import mypackage.CustomLinkedList;

public class KReverseInLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        int k = 2;

        CustomLinkedList newList = reverseList(list, k);
        newList.display();
        newList.addLast(10);
        System.out.println(newList.size());
        newList.display();
    }

    public static CustomLinkedList reverseList(CustomLinkedList list, int k) {
        CustomLinkedList prevList = new CustomLinkedList();

        while(list.size() > 0) {
            CustomLinkedList currList = new CustomLinkedList();

            if(list.size() >= k) {
                for(int i = 0; i < k; ++i) {
                    int data = list.removeFirst();
                    currList.addFirst(data);
                }
            } else {
                for(int i = 0; i < list.size(); ++i) {
                    int data = list.removeFirst();
                    currList.addLast(data);
                }
            }

            if(prevList.size() == 0) {
                prevList = currList;
            } else {
                prevList.getTail().next = currList.getHead();
                prevList.setTail(currList.getTail());
                prevList.setSize(prevList.size() + currList.size());
            }
        }

        return prevList;
    }
}