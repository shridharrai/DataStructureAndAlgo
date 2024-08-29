import mypackage.CustomLinkedList;
import mypackage.Node;

public class AddTwoLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(2);
        CustomLinkedList list2 = new CustomLinkedList();
        list2.addLast(4);
        list2.addLast(6);
        list2.addLast(5);

        CustomLinkedList sum = new CustomLinkedList();
        int carry = calculateSum(list1.getHead(), list1.size(), list2.getHead(), list2.size(), sum);
        if(carry > 0) {
            sum.addFirst(carry);
        }
        
        sum.display();
    }

    public static int calculateSum(Node firstDigit, int firstDigitPlace, Node secondDigit, int secondDigitPlace, CustomLinkedList sumList) {
        if(firstDigit == null && secondDigit == null) {
            return 0;
        }

        int sumDigit = 0;
        if(firstDigitPlace > secondDigitPlace) {
            int oldCarry = calculateSum(firstDigit.next, firstDigitPlace - 1, secondDigit, secondDigitPlace, sumList);
            sumDigit = firstDigit.data + oldCarry;
        } else if(secondDigitPlace > firstDigitPlace) {
            int oldCarry = calculateSum(firstDigit, firstDigitPlace, secondDigit.next, secondDigitPlace - 1, sumList);
            sumDigit = secondDigit.data + oldCarry;
        } else {
            int oldCarry = calculateSum(firstDigit.next, firstDigitPlace - 1, secondDigit.next, secondDigitPlace - 1, sumList);
            sumDigit = firstDigit.data + secondDigit.data + oldCarry;
        }

        int newDigit = sumDigit % 10;
        int newCarry = sumDigit / 10;

        sumList.addFirst(newDigit);
        return newCarry;
    }
}