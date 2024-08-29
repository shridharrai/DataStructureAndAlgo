import mypackage.CustomLinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);

        CustomLinkedList newList = removeDuplicates(list);
        newList.display();
    }

    public static CustomLinkedList removeDuplicates(CustomLinkedList list) {
        CustomLinkedList newList = new CustomLinkedList();

        while(list.size() > 0) {
            int val = list.removeFirst();
            
            if(newList.size() == 0 || newList.getTail().data != val) {
                newList.addLast(val);
            }
        }

        return newList;
    }
}