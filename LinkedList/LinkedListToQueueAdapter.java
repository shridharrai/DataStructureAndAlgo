import mypackage.CustomLinkedList;

public class LinkedListToQueueAdapter {
    private static class Queue {
        CustomLinkedList list;

        public Queue() {
            list = new CustomLinkedList();
        }

        int size() {
            return list.size();
        }

        void add(int val) {
            list.addLast(val);
        }

        int remove() {
            if(size() == 0) {
                System.out.println("Oueue Underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int peek() {
            if(size() == 0) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.peek());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.size());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}