import mypackage.CustomLinkedList;

public class LinkedListToStackAdapter {
    private static class Stack {
        CustomLinkedList list;

        public Stack() {
            list = new CustomLinkedList();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int top() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}