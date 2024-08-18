import mypackage.CustomLinkedList;

public class BasicLinkedListFunctions {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.size());
        list.display();
        
        // list.removeFirst();
        // System.out.println(list.size());
        // list.display();

        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
        // System.out.println(list.getAt(2));
        // list.getAt(5);
        // list.getAt(-2);

        // list.addFirst(10);
        // list.addFirst(5);

        // list.addAt(0, 10);
        // list.addAt(5, 60);
        // list.addAt(3, 35);

        // list.removeLast();
        list.removeAt(2);
        System.out.println(list.size());
        list.display();
    }
}