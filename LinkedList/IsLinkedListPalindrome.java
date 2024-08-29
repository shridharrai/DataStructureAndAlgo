import mypackage.CustomLinkedList;
import mypackage.Node;

public class IsLinkedListPalindrome {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        left = list.getHead();
        boolean res = isPalindrome(list.getHead());
        System.out.println(res);
    }

    static Node left;
    public static boolean isPalindrome(Node right) {
        if(right == null) {
            return true;
        }

        boolean res = isPalindrome(right.next);

        if(res == false) {
            return false;
        } else if(right.data != left.data) {
            return false;
        } else {
            left = left.next;
            return true;
        }
    }
}